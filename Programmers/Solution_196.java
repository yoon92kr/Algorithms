// 문제 : n의 배수
// 결과 : 성공
// Score : 100
public class Solution_196 {

	public int solution(int param, int target) {
		return param % target == 0 ? 1 : 0;
	}

}