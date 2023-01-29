// 문제 : 문자열 뒤집기
// 결과 : 성공
// Score : 100
public class Solution_83 {

	public String solution(String param) {
		return reverse(param, param.length());
	}

	String reverse(String param, int len) {
		String result = "";
		for (int i = len - 1; i >= 0; i--) {
			result += param.charAt(i);
		}
		return result;
	}

}