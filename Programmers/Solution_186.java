import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 문제 : 문자열 출력하기
// 결과 : 성공
// Score : 100
public class Solution_186 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String param = br.readLine();
		bw.write(param);
		bw.flush();
		bw.close();
		br.close();

	}
}