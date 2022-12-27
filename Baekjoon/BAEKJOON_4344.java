import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// public class Main {
public class BAEKJOON_4344 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		for (int i = 0; i < count; i++) {
			String[] paramArray = br.readLine().split(" ");
			double studentNum = Integer.parseInt(paramArray[0]);
			double avg = 0;
			double overAvg = 0;

			for (int j = 1; j <= studentNum; j++) {
				avg += Integer.parseInt(paramArray[j]);
			}

			avg = avg / studentNum;

			for (int k = 1; k <= studentNum; k++) {
				overAvg += Integer.parseInt(paramArray[k]) > avg ? 1 : 0;
			}

			bw.write(String.format("%.3f", (overAvg / studentNum) * 100) + "%\n");

		}

		bw.flush();
		bw.close();
		br.close();

	}
}