import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
public class BAEKJOON_10951 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String param = br.readLine();
			while (!param.equals("")) {
				String[] splitParam = param.split(" ");
				System.out.println(Integer.parseInt(splitParam[0]) + Integer.parseInt(splitParam[1]));

				param = br.readLine();
			}

			br.close();
		} catch (Exception e) {
			;
		}

	}
}
