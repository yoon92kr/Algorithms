import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// public class Main {
public class BAEKJOON_15552 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		int result = 0;

		for (int i = 0; i < count; i++) {
			
			String[] paramArray = br.readLine().split(" ");
			result = Integer.parseInt(paramArray[0]) + Integer.parseInt(paramArray[1]);
			bw.write(Integer.toString(result) + "\n");
			
		}

		bw.flush();
		bw.close();
		br.close();

	}
}
