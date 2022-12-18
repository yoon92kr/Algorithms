// 문제 : 3진법 뒤집기
// 결과 : 성공
// Score : 100
public class Solution_44 {

	public int solution(int param) {
		return get10(revert(get3(param)));
	}

	String get3(int param) {
		return Integer.toString(param, 3);
	}

	int get10(String param) {
		return Integer.parseInt(param, 3);
	}

	String revert(String param) {
		StringBuffer sb = new StringBuffer(param);
		return sb.reverse().toString();
	}
}