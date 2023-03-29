// 문제 : 저주의 숫자 3
// 결과 : 성공
// Score : 100
public class Solution_159 {

	public int solution(int param) {
		int result = 0;

		for (int i = 1; i <= param; i++) {
			result++;
			while (Integer.toString(result).indexOf("3") != -1 || result % 3 == 0) {
				result++;
			}
		}

		return result;
	}

}
