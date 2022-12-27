import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// public class Main {
public class BAEKJOON_2941 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String param = br.readLine();
		int count = 0;
		boolean flag = false;
		String[] RULE = { "dz=", "c=", "c-", "d-", "s=", "z=", "lj", "nj" };

		for (int j = 0; j < 8; j++) {
			if (param.indexOf(RULE[j]) != -1) {
				flag = true;
				while (flag) {
					int startIndex = param.indexOf(RULE[j]);
					int endIndex = startIndex + RULE[j].length();
					if (startIndex == 0) {
						param = "*" + param.substring(endIndex);
						count++;
					} else if (startIndex == param.length() || startIndex == param.length() - 1
							|| startIndex == param.length() - 2) {
						param = param.substring(0, startIndex) + "*";
						count++;
					} else {
						param = param.substring(0, startIndex) + "*" + param.substring(endIndex);
						count++;
					}

					if (param.indexOf(RULE[j]) == -1) {
						flag = false;
					}
				}
			}
		}

		param = param.replace("*", "");
		bw.write(Integer.toString(count + param.length()));

		bw.flush();
		bw.close();
		br.close();

	}

}
