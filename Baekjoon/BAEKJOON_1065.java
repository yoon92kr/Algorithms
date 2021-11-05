import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// public class Main {
public class BAEKJOON_1065 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int maxNum = Integer.parseInt(br.readLine());
		int result = 99;

		if (maxNum < 100) {
			result = maxNum;
		} else {
			for (int i = 110; i <= maxNum; i++) {
				int third = i / 100;
				int second = (i - third * 100) / 10;
				int first = i - third * 100 - second * 10;

				if (first - second == second - third)
					result++;
			}

		}

		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		br.close();

	}

}
