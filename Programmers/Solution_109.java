// 문제 : 대문자와 소문자
// 결과 : 성공
// Score : 100
public class Solution_109 {

	public String solution(String param) {
		String result = "";

		for (int i = 0; i < param.length(); i++) {
			char target = param.charAt(i);
			result += target > 96 ? Character.toUpperCase(target) : Character.toLowerCase(target);
		}

		return result;
	}

}