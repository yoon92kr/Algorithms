// 문제 : 합성수 찾기
// 결과 : 성공
// Score : 100
public class Solution_131 {

	public int solution(int param) {
		int result = 0;
		for (int i = 1; i <= param; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				count += i % j == 0 ? 1 : 0;
			}
			result += count >= 3 ? 1 : 0;
		}

		return result;
	}

}