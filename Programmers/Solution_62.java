// 문제 : JadenCase 문자열 만들기
// 결과 : 성공
// Score : 100
public class Solution_62 {

	public String solution(String param) {
		return jadenCase(param.split(" ", -1));
	}

	String jadenCase(String[] param) {
		String result = "";
		for (int i = 0; i < param.length; i++) {
			String item = param[i];
			for (int j = 0; j < item.length(); j++) {
				char target = item.charAt(j);
				if (j == 0) {
					result += target > 96 ? (char) (target - 32) : target;
				} else {
					result += target > 96 ? target : (char) (target + 32);
				}
			}
			result += i < param.length - 1 ? " " : "";
		}
		return result;
	}

}