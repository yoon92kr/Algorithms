// 문제 : 짝수는 싫어요
// 결과 : 성공
// Score : 100
public class Solution_124 {

	public int[] solution(int param) {
		return getOdd(param, param % 2 == 0 ? param / 2 : param / 2 + 1);
	}

	int[] getOdd(int param, int len) {
		int[] result = new int[len];
		result[0] = 1;
		for (int i = 1; i < len; i++) {
			result[i] = result[i - 1] + 2;
		}
		return result;
	}

}