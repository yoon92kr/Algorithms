import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

// public class Main {
public class BAEKJOON_10952 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Integer> paramList = new ArrayList<Integer>();

		while (true) {
			String[] splitParam = br.readLine().split(" ");
			int a = Integer.parseInt(splitParam[0]);
			int b = Integer.parseInt(splitParam[1]);
			if (a == 0 && b == 0) {
				break;
			} else {
				paramList.add(a + b);
			}
		}

		for (int i = 0; i < paramList.size(); i++) {
			System.out.println(paramList.get(i));
		}

		br.close();

	}
}
