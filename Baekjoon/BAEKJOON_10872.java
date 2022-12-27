import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// public class Main {
public class BAEKJOON_10872 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int param = Integer.parseInt(br.readLine());
		int result = 1;
		for (int i = 1; i <= param; i++) {
			result *= i;
		}

		bw.write(Integer.toString(result));

		bw.flush();
		bw.close();
		br.close();

	}
}