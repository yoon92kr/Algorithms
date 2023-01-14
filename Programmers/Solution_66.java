// 문제 : 올바른 괄호
// 결과 : 성공
// Score : 100
public class Solution_66 {

	boolean solution(String param) {
		return checkBracket(param, param.length());
	}

	boolean checkBracket(String param, int len) {
		int openBracket = 0;
		boolean result = true;

		for (int i = 0; i < len; i++) {
			openBracket += param.charAt(i) == '(' ? 1 : -1;
			result = openBracket < 0 ? false : result;
			if (!result)
				break;
		}

		return openBracket == 0 ? result : false;
	}

}