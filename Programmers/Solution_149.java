// 문제 : 유한소수 판별하기
// 결과 : 성공
// Score : 100
public class Solution_149 {

	public int solution(int a, int b) {
		return Double.toString((double) a / b).length() < 18 ? 1 : 2;
	}

}