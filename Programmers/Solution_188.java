import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 문제 : a와 b 출력하기
// 결과 : 성공
// Score : 100
public class Solution_188 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] params = br.readLine().split(" ");
		bw.write("a = " + params[0] + "\n");
		bw.write("b = " + params[1]);

		bw.flush();
		bw.close();
		br.close();

	}
}