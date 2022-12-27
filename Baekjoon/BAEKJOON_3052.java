import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

// public class Main {
public class BAEKJOON_3052 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> resultList = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			int param = Integer.parseInt(br.readLine()) % 42;
			if (!resultList.contains(param)) {
				resultList.add(param);
			}
		}

		System.out.println(resultList.size());

		bw.flush();
		bw.close();
		br.close();

	}
}