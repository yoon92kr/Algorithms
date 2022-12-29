// 문제 : 가운데 글자 가져오기
// 결과 : 성공
// Score : 100
public class Solution_26 {

	public String solution(String param) {
		int len = param.length();
		return len % 2 == 0 ? even(param, len) : odd(param, len);
	}

	String even(String param, int len) {
		return param.substring(len / 2 - 1, len / 2 + 1);
	}

	String odd(String param, int len) {
		return param.substring(len / 2, len / 2 + 1);
	}

}
