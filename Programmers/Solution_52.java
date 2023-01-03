// 문제 : 나머지가 1이 되는 수 찾기
// 결과 : 성공
// Score : 100
public class Solution_52 {

	public int solution(int param) {
		int result = 0;

		for (int i = 2; i < param; i++) {
			if (param % i == 1) {
				result = i;
				break;
			}
		}
		return result;
	}
}