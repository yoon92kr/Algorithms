// 문제 : 가장 큰 수 찾기
// 결과 : 성공
// Score : 100
public class Solution_84 {

	public int[] solution(int[] param) {
		return maxNum(param, param.length);
	}

	int[] maxNum(int[] param, int len) {

		int[] result = new int[] { 0, 0 };

		for (int i = 0; i < len; i++) {
			if (param[i] > result[0]) {
				result[0] = param[i];
				result[1] = i;
			}
		}

		return result;
	}

}