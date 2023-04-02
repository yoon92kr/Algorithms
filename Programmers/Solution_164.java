// 문제 : 안전지대
// 결과 : 성공
// Score : 100
public class Solution_164 {

	public int solution(int[][] param) {
		int safeZone = 0;
		// 위험지역 Set
		for (int i = 0; i < param.length; i++) {
			for (int j = 0; j < param.length; j++) {
				if (param[i][j] == 1)
					setArea(param, i, j);
			}
		}
		// 안전지역 Count
		for (int i = 0; i < param.length; i++) {
			for (int j = 0; j < param.length; j++) {
				if (param[i][j] == 0)
					safeZone++;
			}
		}

		return safeZone;
	}

	void setArea(int[][] param, int x, int y) {
		for (int i = -1; i < 2; i++) {
			for (int j = -1; j < 2; j++) {
				try {
					if (param[x + i][y + j] == 0)
						param[x + i][y + j] = 2;
				} catch (Exception e) {
				}
			}
		}
	}

}
