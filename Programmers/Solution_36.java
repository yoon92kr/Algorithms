// 문제 : 약수의 합
// 결과 : 성공
// Score : 100
public class Solution_36 {

	public int solution(int param) {
		return sum(param, param / 2);
	}

	int sum(int param, int len) {
		int result = param;
		for (int i = 1; i <= len; i++) {
			if (param % i == 0) {
				result += i;
			}
		}
		return result;
	}
}
