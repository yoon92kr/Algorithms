import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
public class BAEKJOON_10950 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int paramSize;

		paramSize = Integer.parseInt(br.readLine());
		String[] paramArray = new String[paramSize];

		for (int i = 0; i < paramSize; i++) {
			paramArray[i] = br.readLine();
		}

		for (int j = 0; j < paramSize; j++) {
			String[] splitParam = paramArray[j].split(" ");
			System.out.println(Integer.parseInt(splitParam[0]) + Integer.parseInt(splitParam[1]));
		}

		br.close();

	}
}
