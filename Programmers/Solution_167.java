// 문제 : 삼총사
// 결과 : 성공
// Score : 100
public class Solution_167 {

	public int solution(int[] param) {
		int result = 0;
		for (int i = 0; i < param.length; i++) {
			for (int j = i + 1; j < param.length; j++) {
				for (int k = j + 1; k < param.length; k++) {
					result += param[i] + param[j] + param[k] == 0 ? 1 : 0;
				}
			}
		}
		return result;
	}

}