import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// public class Main {
public class BAEKJOON_5622 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String param = br.readLine();
		int result = 0;
		for (int i = 0; i < param.length(); i++) {
			char item = param.charAt(i);

			if (65 <= item && item <= 67) {
				result += 3;
			} else if (68 <= item && item <= 70) {
				result += 4;
			} else if (71 <= item && item <= 73) {
				result += 5;
			} else if (74 <= item && item <= 76) {
				result += 6;
			} else if (77 <= item && item <= 79) {
				result += 7;
			} else if (80 <= item && item <= 83) {
				result += 8;
			} else if (84 <= item && item <= 86) {
				result += 9;
			} else if (87 <= item && item <= 90) {
				result += 10;
			}
		}

		bw.write(Integer.toString(result));

		bw.flush();
		bw.close();
		br.close();

	}
}