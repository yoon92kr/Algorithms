import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// public class Main {
public class BAEKJOON_2292 {
	public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(math(Integer.parseInt(b.readLine())));
	}

	private static int math(int p) {
		if (p == 1)
			return 1;
		int n = 2;
		int d = 1;
		while (n <= p)
			n += 6 * d++;
		return d;
	}

}
