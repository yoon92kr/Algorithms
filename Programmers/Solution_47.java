// 문제 : 문자열 내 마음대로 정렬하기
// 결과 : 성공
// Score : 100
public class Solution_47 {

	public String solution(String param, int add) {
		return hex(param, add, param.length());
	}

	String hex(String param, int add, int len) {
		String result = "";
		char target;

		for (int i = 0; i < len; i++) {
			target = param.charAt(i);
			result += spaceCheck(target) ? target : add(target, add);
		}
		return result;
	}

	char add(char param, int add) {
		return isLower(param) ? addLower(param, add) : addUpper(param, add);
	}

	char addLower(char param, int add) {
		param += add;
		if (param > 122) {
			param -= 26;
		}
		return param;
	}

	char addUpper(char param, int add) {
		param += add;
		if (param > 90) {
			param -= 26;
		}
		return param;
	}

	boolean spaceCheck(char param) {
		return param == 32 ? true : false;
	}

	boolean isLower(char param) {
		return param > 96 ? true : false;
	}
}