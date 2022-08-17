// 문제 : 내적
// 결과 : 성공
// Score : 100
public class Solution_21 {

	public int solution(int[] a, int[] b) {
		return sum(a, b, a.length);
	}

	int sum(int[] a, int[] b, int len) {
		int result = 0;
		for (int i = 0; i < len; i++) {
			result += a[i] * b[i];
		}
		return result;
	}
}
