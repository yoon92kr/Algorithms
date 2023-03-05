// 문제 : 점의 위치 구하기
// 결과 : 성공
// Score : 100
public class Solution_125 {

	public int solution(int[] param) {
		return param[0] * param[1] > 0 ? param[0] > 0 ? 1 : 3 : param[0] > 0 ? 4 : 2;
	}

}