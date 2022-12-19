// 문제 : 이상한 문자 만들기
// 결과 : 성공
// Score : 100
public class Solution_43 {

	public String solution(String param) {
		return change(param, param.length());
	}

	String change(String param, int len) {
		int index = 0;
		String result = "";
		char target;

		for (int i = 0; i < len; i++) {
			target = param.charAt(i);

			if (target == 32) {
				index = 0;
				result += target;
				continue;
			}

			if (index % 2 == 0 && target >= 97) {
				target -= 32;
			} else if (index % 2 == 1 && target < 97) {
				target += 32;
			}
			index++;
			result += target;

		}

		return result;
	}
}
