import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// public class Main {
public class BAEKJOON_3003 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] param = br.readLine().split(" ");
		int[] RULE = { 1, 1, 2, 2, 2, 8 };

		for (int i = 0; i < 6; i++) {
			param[i] = Integer.toString(RULE[i] - Integer.parseInt(param[i]));
		}

		bw.write(String.join(" ", param));
		bw.flush();
		bw.close();
		br.close();

	}

}