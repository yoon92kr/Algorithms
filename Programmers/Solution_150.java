import java.util.Arrays;

// 문제 : 특이한 정렬
// 결과 : 성공
// Score : 100
public class Solution_150 {

	public int[] solution(int[] param, int s) {
		double[] tmpParam = new double[param.length];
		for (int i = 0; i < param.length; i++) {
			tmpParam[i] = param[i] - s > 0 ? param[i] - s - 0.1 : Math.abs(param[i] - s);
		}
		Arrays.sort(tmpParam);
		for (int i = 0; i < param.length; i++) {
			param[i] = Math.ceil(tmpParam[i]) != tmpParam[i] ? (int) (tmpParam[i] + s + 0.1)
					: (int) Math.abs(tmpParam[i] - s);
		}

		return param;
	}

}