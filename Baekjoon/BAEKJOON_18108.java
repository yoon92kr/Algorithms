import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
public class BAEKJOON_18108 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int param = Integer.parseInt(br.readLine());

		System.out.println(param - 543);

		br.close();

	}
}
