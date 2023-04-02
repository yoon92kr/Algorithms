// 문제 : 분수의 덧셈
// 결과 : 성공
// Score : 100
public class Solution_162 {

	public int[] solution(int denum1, int num1, int denum2, int num2) {
		int[] result = { denum1 * num2 + denum2 * num1, num1 * num2 };
		int min = Math.min(result[0], result[1]);
		for (int i = 2; i <= min; i++) {
			if (result[0] % i == 0 && result[1] % i == 0) {
				result[0] /= i;
				result[1] /= i;
				i--;
			}
		}
		return result;
	}

}
