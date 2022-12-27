import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
public class BAEKJOON_10871 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, x;
		boolean flag = true;

		String[] paramArray = br.readLine().split(" ");
		n = Integer.parseInt(paramArray[0]);
		x = Integer.parseInt(paramArray[1]);

		String[] splitArray = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			
			if (Integer.parseInt(splitArray[i]) < x) {
				if (flag) {
					flag = false;
					System.out.print(splitArray[i]);
				} else {
					System.out.print(" " + splitArray[i]);
				}
			}
			
		}

		br.close();

	}
}
