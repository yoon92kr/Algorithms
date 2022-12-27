import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
public class BAEKJOON_2753 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int param;

		param = Integer.parseInt(br.readLine());

		if (param % 4 == 0 && (param % 100 != 0 || param % 400 == 0)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		br.close();
	}
}
