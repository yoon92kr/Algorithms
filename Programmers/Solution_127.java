// 문제 : 피자 나눠 먹기 (2)
// 결과 : 성공
// Score : 100
public class Solution_127 {

	public int solution(int param) {
		int result = 0;
		while (true) {
			result++;
			if ((result * 6) % param == 0)
				break;
		}

		return result;
	}

}