import java.util.Arrays;

// 문제 : H-Index
// 결과 : 성공
// Score : 100
public class Solution_180 {

	public int solution(int[] param) {
		if (param.length == 1)
			return param[0] == 0 ? 0 : 1;

		Arrays.sort(param);

		for (int i = 0; i < param.length; i++) {
			for (int j = param[i]; j > 0; j--) {
				if (j == param.length - i) {
					return j;
				}
			}
		}
		return 0;
	}

}