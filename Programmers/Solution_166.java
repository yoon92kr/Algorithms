// 문제 : 평행
// 결과 : 성공
// Score : 100
public class Solution_166 {
	public int solution(int[][] param) {
		int[][] pattern = new int[][] { { 0, 0 }, { 2, 3 }, { 1, 3 }, { 1, 2 } };
		for (int i = 1; i < 4; i++) {
			double test1 = (double) (param[0][1] - param[i][1]) / (param[0][0] - param[i][0]);
			double test2 = (double) (param[pattern[i][0]][1] - param[pattern[i][1]][1])
					/ (param[pattern[i][0]][0] - param[pattern[i][1]][0]);
			if (test1 == test2) {
				return 1;
			}
		}
		return 0;
	}
}