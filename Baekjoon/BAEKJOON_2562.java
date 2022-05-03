import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
public class BAEKJOON_2562 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int maxNum = 0;
		int maxNo = 0;

		for (int i = 1; i < 10; i++) {
			int target = Integer.parseInt(br.readLine());
			if (target > maxNum) {
				maxNum = target;
				maxNo = i;
			}
		}

		System.out.printf("%d\n%d", maxNum, maxNo);

		br.close();
	}
}
