import java.util.Arrays;

// 문제 : 직사각형 넓이 구하기
// 결과 : 성공
// Score : 100
public class Solution_154 {

	public int solution(int[][] param) {
		int[] x = new int[4];
		int[] y = new int[4];

		for (int i = 0; i < param.length; i++) {
			x[i] = param[i][0];
			y[i] = param[i][1];
		}

		Arrays.sort(x);
		Arrays.sort(y);

		return (x[3] - x[0]) * (y[3] - y[0]);
	}

}