import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// public class Main {
public class BAEKJOON_8958 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());

		for (int i = 0; i < count; i++) {
			int score = 0;
			int add = 0;
			String param = br.readLine();

			for (int j = 0; j < param.length(); j++) {
				if (param.charAt(j) == 'O') {
					add++;
					score += add;
				} else {
					add = 0;
				}
			}
			bw.write(Integer.toString(score) + "\n");
		}

		bw.flush();
		bw.close();
		br.close();

	}
}
