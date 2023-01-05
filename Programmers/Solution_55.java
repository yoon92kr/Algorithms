// 문제 : 약수의 개수와 덧셈
// 결과 : 성공
// Score : 100
public class Solution_55 {

	public int solution(int left, int right) {
		return sum(left, right);
	}

	int sum(int left, int right) {
		int result = 0;
		for (int i = left; i <= right; i++) {
			result += check(i, i / 2) * i;
		}
		return result;
	}

	int check(int param, int len) {
		int result = 1;
		for (int i = 1; i <= len; i++) {
			if (param % i == 0) {
				result++;
			}
		}
		return result % 2 == 0 ? 1 : -1;
	}

}