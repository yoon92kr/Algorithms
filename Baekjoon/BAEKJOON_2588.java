import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
public class BAEKJOON_2588 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a;
		String b;

		a = Integer.parseInt(br.readLine());
		b = br.readLine();

		System.out.println(Integer.parseInt(b.substring(2, 3)) * a);
		System.out.println(Integer.parseInt(b.substring(1, 2)) * a);
		System.out.println(Integer.parseInt(b.substring(0, 1)) * a);
		System.out.println(Integer.parseInt(b) * a);

		br.close();

	}
}
