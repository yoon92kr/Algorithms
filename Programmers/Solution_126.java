// 문제 : 최댓값 만들기 (2)
// 결과 : 성공
// Score : 100
public class Solution_126 {

	public int solution(int[] param) {
		int result = param[0] * param[1];
		for (int i = 0; i < param.length; i++) {
			for (int j = i + 1; j < param.length; j++) {
				result = param[i] * param[j] > result ? param[i] * param[j] : result;
			}
		}
		return result;
	}

}