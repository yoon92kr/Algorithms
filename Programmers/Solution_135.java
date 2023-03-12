import java.util.Arrays;

// 문제 : 가까운 수
// 결과 : 성공
// Score : 100
public class Solution_135 {

	public int solution(int[] param, int target) {
		Arrays.sort(param);
		int deff = Math.abs(target - param[0]);
		int result = param[0];

		for (int i = 1; i < param.length; i++) {

			if (Math.abs(target - param[i]) < deff) {
				deff = Math.abs(target - param[i]);
				result = param[i];
			}

		}
		return result;
	}

}