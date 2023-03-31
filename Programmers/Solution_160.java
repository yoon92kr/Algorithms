// 문제 : 연속된 수의 합
// 결과 : 성공
// Score : 100
public class Solution_160 {

	public int[] solution(int len, int param) {

		int[] result = new int[len];
		int target = param / len - len / 2;
		result[0] = param % len == 0 ? target : target + 1;

		for (int i = 1; i < len; i++) {
			result[i] = result[i - 1] + 1;
		}

		return result;
	}

}
