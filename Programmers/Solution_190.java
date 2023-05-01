import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 문제 : 대소문자 바꿔서 출력하기
// 결과 : 성공
// Score : 100
public class Solution_190 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder str = new StringBuilder(br.readLine());

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < 91) {
				str.replace(i, i + 1, String.valueOf((char) (str.charAt(i) + 32)));
			} else {
				str.replace(i, i + 1, String.valueOf((char) (str.charAt(i) - 32)));
			}
		}
		bw.write(str.toString());
		bw.flush();

		bw.close();
		br.close();
	}

}