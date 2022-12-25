import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// public class Main {
public class BAEKJOON_1546 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		String[] parmaArray = br.readLine().split(" ");
		double[] scoreArray = new double[count];

		for (int i = 0; i < count; i++) {
			scoreArray[i] = Integer.parseInt(parmaArray[i]);
		}
		Arrays.sort(scoreArray);
		double maxScore = scoreArray[count - 1];
		double result = 0;
		for (int j = 0; j < count; j++) {
			result += (scoreArray[j] / maxScore) * 100;
		}

		bw.write(Double.toString(result / count));

		bw.flush();
		bw.close();
		br.close();

	}
}