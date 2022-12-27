import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// public class Main {
public class BAEKJOON_10809 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String param = br.readLine();
		char check = 'a';

		for (int i = 0; i < 26; i++) {
			bw.write(param.indexOf(Character.toString(check)) + " ");
			check++;
		}

		bw.flush();
		bw.close();
		br.close();

	}
}