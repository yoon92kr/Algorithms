// 문제 : 369게임
// 결과 : 성공
// Score : 100
public class Solution_118 {

	public int solution(int param) {
		String strParam = Integer.toString(param);
		return strParam.length() - strParam.replaceAll("(3|6|9)", "").length();
	}

}