import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
public class BAEKJOON_11022 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());
		String[] param = new String[count];

		for (int i = 0; i < count; i++) {
			param[i] = br.readLine();
		}

		for (int i = 0; i < count; i++) {
			String[] splitParam = param[i].split(" ");
			int a = Integer.parseInt(splitParam[0]);
			int b = Integer.parseInt(splitParam[1]);
			System.out.printf("Case #%d: %d + %d = %d\n", i + 1, a, b, a + b);
		}

		br.close();
	}
}
