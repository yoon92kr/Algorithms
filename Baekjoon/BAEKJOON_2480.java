import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;

// public class Main {
public class BAEKJOON_2480 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] paramArray = br.readLine().split(" ");
		ArrayList<String> sameArray = new ArrayList<String>();
		HashMap<String, Integer> paramMap = new HashMap<String, Integer>();
		paramMap.put("a", Integer.parseInt(paramArray[0]));
		paramMap.put("b", Integer.parseInt(paramArray[1]));
		paramMap.put("c", Integer.parseInt(paramArray[2]));
		int result = 0;

		if (paramMap.get("a") == paramMap.get("b"))
			sameArray.add("a b");
		if (paramMap.get("a") == paramMap.get("c"))
			sameArray.add("a c");
		if (paramMap.get("b") == paramMap.get("c"))
			sameArray.add("b c");

		if (sameArray.size() == 3) {
			result = 10000 + (paramMap.get("a") * 1000);
		} else if (sameArray.size() == 1) {
			String[] splitSame = sameArray.get(0).split(" ");
			result = 1000 + (paramMap.get(splitSame[0]) * 100);
		} else {
			if (paramMap.get("a") > paramMap.get("b")) {
				result = paramMap.get("a");
			} else if (paramMap.get("b") > paramMap.get("a")) {
				result = paramMap.get("b");
			}
			if (paramMap.get("c") > result) {
				result = paramMap.get("c");
			}
			result *= 100;
		}
		bw.write(Integer.toString(result));
		bw.flush();
		bw.close();
		br.close();

	}
}