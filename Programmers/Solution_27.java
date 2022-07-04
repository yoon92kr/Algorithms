// 문제 : 두 정수 사이의 합
// 결과 : 성공
// Score : 100
public class Solution_27 {

	public long solution(int a, int b) {
		return a == b ? a : sum(check(a, b));
	}

	long sum(int[] param) {
		long result = 0;
		for (int i = param[0]; i <= param[1]; i++) {
			result += i;
		}
		return result;
	}

	int[] check(int a, int b) {
		return a < b ? new int[] { a, b } : new int[] { b, a };
	}

}
