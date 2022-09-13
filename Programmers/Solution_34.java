// 문제 : x만큼 간격이 있는 n개의 숫자
// 결과 : 성공
// Score : 100
public class Solution_34 {

	public long[] solution(int x, int n) {
		return test(x, n);
	}

	long[] test(int x, int n) {
		long[] result = new long[n];
		long item = x;
		for (int i = 0; i < n; i++) {
			result[i] = item;
			item += x;
		}
		return result;
	}
}
