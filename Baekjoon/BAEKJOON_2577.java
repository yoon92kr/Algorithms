import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

// public class Main {
public class BAEKJOON_2577 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int paramA = Integer.parseInt(br.readLine());
		int paramB = Integer.parseInt(br.readLine());
		int paramC = Integer.parseInt(br.readLine());
		HashMap<String, Integer> resultMap = new HashMap<String, Integer>();

		for (int i = 0; i < 10; i++) {
			resultMap.put(Integer.toString(i), 0);
		}

		String result = Integer.toString(paramA * paramB * paramC);
		for (int j = 0; j < result.length(); j++) {

			switch (result.charAt(j)) {
				case '1':
					resultMap.put("1", resultMap.get("1") + 1);
					break;
				case '2':
					resultMap.put("2", resultMap.get("2") + 1);
					break;
				case '3':
					resultMap.put("3", resultMap.get("3") + 1);
					break;
				case '4':
					resultMap.put("4", resultMap.get("4") + 1);
					break;
				case '5':
					resultMap.put("5", resultMap.get("5") + 1);
					break;
				case '6':
					resultMap.put("6", resultMap.get("6") + 1);
					break;
				case '7':
					resultMap.put("7", resultMap.get("7") + 1);
					break;
				case '8':
					resultMap.put("8", resultMap.get("8") + 1);
					break;
				case '9':
					resultMap.put("9", resultMap.get("9") + 1);
					break;
				case '0':
					resultMap.put("0", resultMap.get("0") + 1);
					break;
			}
		}

		for (int k = 0; k < 10; k++) {
			bw.write(Integer.toString(resultMap.get(Integer.toString(k))) + "\n");
		}

		bw.flush();
		bw.close();
		br.close();

	}
}