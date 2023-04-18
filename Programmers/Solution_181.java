// 문제 : 멀리 뛰기
// 결과 : 성공
// Score : 100
public class Solution_181 {

	public int solution(int param) {
		return param < 2 ? 1 : fibonacci(param + 1) % 1234567;
	}

	int fibonacci(int param) {
		int[] result = new int[param];
		result[0] = 0;
		result[1] = 1;

		for (int i = 2; i < param; i++) {
			result[i] = result[i - 1] % 1234567 + result[i - 2] % 1234567;
		}

		return result[param - 1] + result[param - 2];
	}

}
