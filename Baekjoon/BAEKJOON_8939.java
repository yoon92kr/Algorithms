import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
public class BAEKJOON_8939 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int param;
		int result = 0;

		param = Integer.parseInt(br.readLine());

		for (int i = 1; i <= param; i++) {
			result += i;
		}
		System.out.println(result);
		br.close();

	}
}
