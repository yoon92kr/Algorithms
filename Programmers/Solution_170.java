// 문제 : 겹치는 선분의 길이
// 결과 : 성공
// Score : 100
public class Solution_170 {

	public int solution(int[][] lines) {
		int[] line = new int[200];
		int overLap = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = lines[i][0]; j < lines[i][1]; j++) {
				line[j + 100] += 1;
			}
		}

		for (int i = 0; i < 200; i++) {
			overLap += line[i] > 1 ? 1 : 0;
		}

		return overLap;
	}

}