import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
public class BAEKJOON_1110 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int target = Integer.parseInt(br.readLine());
		int count = 1;
		int param = target;

		while (true) {
			int paramA = param / 10;
			int paramB = param - (paramA * 10);
			int result = paramA + paramB;
			int resultA = result / 10;
			int resultB = result - (resultA * 10);

			if (target == (paramB * 10 + resultB)) {
				break;
			} else {
				param = (paramB * 10 + resultB);
				count++;
			}
		}
		System.out.println(count);
		br.close();
	}
}
