// 문제 : 외계행성의 나이
// 결과 : 성공
// Score : 100
public class Solution_120 {

	public String solution(int param) {
		String strParam = Integer.toString(param);
		String result = "";
		for (int i = 0; i < strParam.length(); i++) {
			result += (char) (strParam.charAt(i) + 49);
		}
		return result;
	}

}