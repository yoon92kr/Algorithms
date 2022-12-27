import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
public class BAEKJOON_11021 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());
		int[] result = new int[count];

		for (int i = 0; i < count; i++) {
			String[] param = br.readLine().split(" ");
			result[i] = Integer.parseInt(param[0]) + Integer.parseInt(param[1]);
		}

		for (int i = 0; i < count; i++) {
			System.out.printf("Case #%d: %d\n", i + 1, result[i]);
		}

		br.close();
	}
}
