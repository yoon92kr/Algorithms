import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 문제 : 문자열 반복해서 출력하기
// 결과 : 성공
// Score : 100
public class Solution_188 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] params = br.readLine().split(" ");

		String str = params[0];
		int retryCnt = Integer.parseInt(params[1]);
		String result = "";

		for (int i = 0; i < retryCnt; i++) {
			result += str;
		}

		bw.write(result);
		bw.flush();

		bw.close();
		br.close();
	}

}