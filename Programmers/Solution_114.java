// 문제 : 순서쌍의 개수
// 결과 : 성공
// Score : 100
public class Solution_114 {

	public int solution(int param) {
		int result = 0;
		for (int i = 1; i <= param; i++) {
			result += param % i == 0 ? 1 : 0;
		}
		return result;
	}

}