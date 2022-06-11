import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map.Entry;

// public class Main {
public class BAEKJOON_4673 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

		for (int i = 1; i <= 9993; i++) {
			data.put(i, i);
		}

		for (int j = 1; j <= 9965; j++) {
			data.remove(selfNum(j));
		}

		for (Entry<Integer, Integer> entrySet : data.entrySet()) {
			bw.write(Integer.toString(entrySet.getKey()) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();

	}

	public static int selfNum(int param) {
		String[] stringParam = Integer.toString(param).split("");
		int result = param;

		for (int i = 0; i < stringParam.length; i++) {
			result += Integer.parseInt(stringParam[i]);
		}

		return result;
	}
}
