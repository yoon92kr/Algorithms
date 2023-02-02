// 문제 : 제곱수 판별하기
// 결과 : 성공
// Score : 100
public class Solution_88 {

	public int solution(int param) {
		return param % Math.sqrt(param) == 0 ? 1 : 2;
	}

}