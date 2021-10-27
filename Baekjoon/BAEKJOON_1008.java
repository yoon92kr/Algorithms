import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {

public class BAEKJOON_1008 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String param = br.readLine();

		String[] splitParam = param.split(" ");

		System.out.println(Double.parseDouble(splitParam[0]) / Double.parseDouble(splitParam[1]));
		br.close();

	}
}
