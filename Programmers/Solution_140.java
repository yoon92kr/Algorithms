// 문제 : 외계어 사전
// 결과 : 성공
// Score : 100
public class Solution_140 {

	public int solution(String[] target, String[] param) {
		int tLen = target.length;
		int pLen = param.length;

		for (int i = 0; i < pLen; i++) {

			if (param[i].length() == tLen) {

				for (int j = 0; j < tLen; j++) {

					if (!param[i].contains(target[j])) {
						break;
					}

					if (j == tLen - 1) {
						return 1;
					}

				}

			}

		}

		return 2;
	}

}
