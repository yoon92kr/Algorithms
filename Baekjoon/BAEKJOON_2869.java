import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// public class Main {
public class BAEKJOON_2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		double a = Integer.parseInt(st.nextToken());
		double b = Integer.parseInt(st.nextToken());
		double v = Integer.parseInt(st.nextToken());

		double result = Math.ceil((b - v) / (b - a));

		System.out.println(String.format("%.0f", result));
		br.close();

	}

}