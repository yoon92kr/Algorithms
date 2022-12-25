import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// public class Main {
public class BAEKJOON_1712 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] param = br.readLine().split(" ");
		int fixCost = Integer.parseInt(param[0]);
		int changeCost = Integer.parseInt(param[1]);
		int price = Integer.parseInt(param[2]);

		int amount = 0;

		if (changeCost > price || price - changeCost == 0) {
			bw.write("-1");
		} else {
			amount = fixCost / (price - changeCost) + 1;
			bw.write(Integer.toString(amount));
		}

		bw.flush();
		bw.close();
		br.close();

	}
}