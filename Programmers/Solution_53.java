// 문제 : 소수 만들기
// 결과 : 성공
// Score : 100
public class Solution_53 {

	public int solution(int[] param) {
		return findNum(param, param.length);
	}

	int findNum(int[] param, int len) {
		int result = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				for (int k = j + 1; k < len; k++) {
					result += check(param[i] + param[j] + param[k]);
				}
			}
		}
		return result;
	}

	int check(int param) {
		int root = (int) Math.sqrt(param);

		for (int i = 2; i <= root; i++) {
			if (param % i == 0) {
				return 0;
			}
		}
		return 1;
	}

}