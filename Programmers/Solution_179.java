// 문제 : 기사단원의 무기
// 결과 : 성공
// Score : 100
public class Solution_179 {

	public int solution(int number, int limit, int power) {
		int weight = 0;
		for (int i = 1; i <= number; i++) {
			weight += countDivisors(i) > limit ? power : countDivisors(i);
		}
		return weight;
	}

	static int countDivisors(int param) {
		int result = 0;

		for (int i = 1; i <= Math.sqrt(param); i++) {
			if (param % i == 0)
				result += param / i == i ? 1 : 2;
		}

		return result;
	}

}
