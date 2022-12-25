import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

// public class Main {
public class BAEKJOON_1463 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int param = Integer.parseInt(br.readLine());
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(param);

		for (int i = 0; i < param; i++) {
			Collections.sort(result);
			if (result.get(0) == 1) {
				bw.write(Integer.toString(i));
				break;
			}

			HashSet<Integer> tmp = new HashSet<Integer>();

			for (int j = 0; j < result.size(); j++) {
				if (result.get(j) % 3 == 0)
					tmp.add(result.get(j) / 3);
				if (result.get(j) % 2 == 0)
					tmp.add(result.get(j) / 2);
				if (result.get(j) - 1 != 0)
					tmp.add(result.get(j) - 1);

			}

			result = new ArrayList<Integer>();
			result.addAll(tmp);
		}

		bw.flush();
		bw.close();
		br.close();

	}

}