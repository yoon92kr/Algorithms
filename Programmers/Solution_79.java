// 문제 : 짝수의 합
// 결과 : 성공
// Score : 100
public class Solution_79 {

	public int solution(int param) {
		return evenNum(param);
	}

	int evenNum(int param) {
		int result = 0;
		for (int i = 0; i <= param; i += 2) {
			result += i;
		}
		return result;
	}
}
