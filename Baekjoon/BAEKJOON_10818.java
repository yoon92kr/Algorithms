import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// public class Main {
public class BAEKJOON_10818 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		int[] paramArray = new int[count];

		String[] param = br.readLine().split(" ");

		for (int i = 0; i < count; i++) {
			paramArray[i] = Integer.parseInt(param[i]);
		}
		Arrays.sort(paramArray);

		bw.write(Integer.toString(paramArray[0]) + " " + Integer.toString(paramArray[count - 1]));

		bw.flush();
		bw.close();
		br.close();

	}
}