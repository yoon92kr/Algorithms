// 문제 : 다음에 올 숫자
// 결과 : 성공
// Score : 100
public class Solution_148 {

	public int solution(int[] param) {
		int diff_1 = param[1] - param[0];
		int diff_2 = param[2] - param[1];
		int lastNum = param[param.length - 1];
		return diff_1 == diff_2 ? lastNum + diff_1 : lastNum * (param[1] / param[0]);
	}

}