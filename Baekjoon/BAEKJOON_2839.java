import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// public class Main {
public class BAEKJOON_2839 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int param = Integer.parseInt(br.readLine());

		// 5 로 나뉠경우 분기
		if (param % 5 == 0) {
			bw.write(Integer.toString(param / 5));
		}
		// 5로 나뉘지 않을 경우 분기
		else {
			int tmpParam = param;
			for (int i = 1; i <= param / 3; i++) {
				tmpParam -= 3;
				if (tmpParam % 5 == 0) {
					bw.write(Integer.toString(i + (tmpParam / 5)));
					break;
				}

				if (tmpParam < 3) {
					bw.write("-1");
				}

			}
		}

		bw.flush();
		bw.close();
		br.close();

	}
}