import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// public class Main {
public class BAEKJOON_2908 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] result = new int[2];
		String[] param = br.readLine().split(" ");

		for (int i = 0; i < 2; i++) {
			StringBuffer sb = new StringBuffer(param[i]);
			result[i] = Integer.parseInt(sb.reverse().toString());
		}

		bw.write(result[0] > result[1] ? Integer.toString(result[0]) : Integer.toString(result[1]));

		bw.flush();
		bw.close();
		br.close();

	}
}