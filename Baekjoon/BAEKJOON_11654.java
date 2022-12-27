import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// public class Main {
public class BAEKJOON_11654 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char param = br.readLine().charAt(0);

		bw.write(Integer.toString(param + 0));

		bw.flush();
		bw.close();
		br.close();

	}
}