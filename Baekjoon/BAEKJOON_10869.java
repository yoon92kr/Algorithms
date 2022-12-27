import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
public class BAEKJOON_10869 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b;

		String[] splitArray = br.readLine().split(" ");
		a = Integer.parseInt(splitArray[0]);
		b = Integer.parseInt(splitArray[1]);

		System.out.printf("%d\n%d\n%d\n%d\n%d", a + b, a - b, a * b, a / b, a % b);

		br.close();

	}
}
