// 문제 : 숫자의 표현
// 결과 : 성공
// Score : 100
public class Solution_63 {

	public int solution(int param) {
		int result = 1;
		int tmpParam = 0;
		int tmp = 0;

		for (int i = 0; i < param; i++) {
			tmp = i;
			tmpParam = 0;
			while (tmpParam <= param) {
				tmp++;
				tmpParam += tmp;
				if (tmpParam == param) {
					result++;
					break;
				} else if (tmpParam > param) {
					break;
				}
			}
		}
		return result;
	}

}