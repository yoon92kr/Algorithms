import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
public class BAEKJOON_1001 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String param = br.readLine();

		String[] splitParam = param.split(" ");

		System.out.println(Integer.parseInt(splitParam[0]) - Integer.parseInt(splitParam[1]));
		br.close();

	}
}
