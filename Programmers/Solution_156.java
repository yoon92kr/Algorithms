// 문제 : 치킨 쿠폰
// 결과 : 성공
// Score : 100
public class Solution_156 {

	public int solution(int param) {
		return param < 10 ? 0 : solution(param / 10 + param % 10) + param / 10;
	}

}