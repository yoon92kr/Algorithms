import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// public class Main {
public class BAEKJOON_2675 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		int num = 0;
		String target = "";
		String targetChar = "";

		for (int i = 0; i < count; i++) {
			String[] param = br.readLine().split(" ");
			num = Integer.parseInt(param[0]);
			target = param[1];

			for (int j = 0; j < target.length(); j++) {
				targetChar = Character.toString(target.charAt(j));
				for (int k = 0; k < num; k++) {
					bw.write(targetChar);
				}

			}
			bw.write("\n");
		}

		bw.flush();
		bw.close();
		br.close();

	}
}