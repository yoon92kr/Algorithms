import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// public class Main {
public class BAEKJOON_10817 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] paramArray = br.readLine().split(" ");
		int[] intArray = new int[3];

		for (int i = 0; i < 3; i++) {
			intArray[i] = Integer.parseInt(paramArray[i]);
		}
		Arrays.sort(intArray);

		bw.write(Integer.toString(intArray[1]));

		bw.flush();
		bw.close();
		br.close();

	}

}