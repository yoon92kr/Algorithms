import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
public class BAEKJOON_11720 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());
		int result = 0;
		String param = br.readLine();

		for (int i = 0; i < count; i++) {
			result += Character.getNumericValue(param.charAt(i));
		}
		System.out.println(result);
		br.close();
	}
}
