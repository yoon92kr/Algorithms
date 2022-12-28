// 문제 : 문자열 내 p와 y의 개수
// 결과 : 성공
// Score : 100
public class Solution_11 {
	public boolean solution(String s) {
		return check(s.toUpperCase(), s.length());
	}

	private boolean check(String param, int len) {
		int p = len - (param.replace("P", "")).length();
		int y = len - (param.replace("Y", "")).length();

		return p == y ? true : false;
	}
}