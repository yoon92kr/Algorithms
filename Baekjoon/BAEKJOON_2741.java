import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
public class BAEKJOON_2741 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int param;
		param = Integer.parseInt(br.readLine());

		for (int i = 1; i <= param; i++) {
			System.out.println(i);
		}
		br.close();

	}
}
