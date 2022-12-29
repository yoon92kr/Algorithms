import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 문제 : 직사각형 별찍기
// 결과 : 성공
// Score : 100
public class Solution_25 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] param = br.readLine().split(" ");
		int w = Integer.parseInt(param[0]);
		int h = Integer.parseInt(param[1]);

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}

}
