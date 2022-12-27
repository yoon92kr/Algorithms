import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
// public class Main {
public class BAEKJOON_25304 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int paramCoast = Integer.parseInt(br.readLine());
		int count = Integer.parseInt(br.readLine());
		int totalCoast = 0;
		int cost = 0;
		int amount = 0;

		for (int i = 0; i < count; i++) {
			String[] param = br.readLine().split(" ");
			cost = Integer.parseInt(param[0]);
			amount = Integer.parseInt(param[1]);

			totalCoast += cost * amount;
		}

		String result = paramCoast != totalCoast ? "No" : "Yes";

		bw.write(result);

		bw.flush();
		bw.close();
		br.close();
	}
}
