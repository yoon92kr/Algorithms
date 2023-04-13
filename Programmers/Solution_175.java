// 문제 : 점프와 순간 이동
// 결과 : 성공
// Score : 100
public class Solution_175 {

	public int solution(int param) {
		int usedFuel = 1;

		while (param > 1) {
			if (param % 2 == 1) {
				usedFuel++;
				param = (param - 1) / 2;
			} else {
				param /= 2;
			}

		}
		return usedFuel;
	}

}