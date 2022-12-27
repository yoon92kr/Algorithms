import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
public class BAEKJOON_10430 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String param = "";
		int[] paramArray = new int[3];

		param = br.readLine();

		String[] splitParam = param.split(" ");
		for (int i = 0; i < 3; i++) {
			paramArray[i] = Integer.parseInt(splitParam[i]);
		}

		System.out.println(((paramArray[0] + paramArray[1]) % paramArray[2]));
		System.out.println((((paramArray[0] % paramArray[2]) + (paramArray[1] % paramArray[2])) % paramArray[2]));
		System.out.println(((paramArray[0] * paramArray[1]) % paramArray[2]));
		System.out.println((((paramArray[0] % paramArray[2]) * (paramArray[1] % paramArray[2])) % paramArray[2]));

		br.close();

	}
}