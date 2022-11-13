// 문제 : 문자열 다루기 기본
// 결과 : 성공
// Score : 100
public class Solution_10 {
	
	public boolean solution(String s) {
		int len = s.length();
		return (len == 4 || len == 6) ? check(s, len) : false;
	}

	private boolean check(String s, int len) {
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) > 57) {
				return false;
			}
		}
		return true;
	}
	
}
