import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
public class BAEKJOON_1330 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String param = br.readLine();
		int a, b;
		String result = "==";

		String[] splitParam = param.split(" ");
		a = Integer.parseInt(splitParam[0]);
		b = Integer.parseInt(splitParam[1]);

		if (a > b) {
			result = ">";
		} else if (a < b) {
			result = "<";
		}

		System.out.println(result);

		br.close();

	}
}
