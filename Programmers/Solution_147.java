// 문제 : 문자열 계산하기
// 결과 : 성공
// Score : 100
public class Solution_147 {

	public int solution(String param) {
		param = param.replaceAll(" ", "");
		int answer = 0;
		int operator = 1;
		String tmp = "";

		for (int i = 0; i < param.length(); i++) {

			if (param.charAt(i) < 47) {
				answer += Integer.parseInt(tmp) * operator;
				tmp = "";
				operator = param.charAt(i) == 43 ? 1 : -1;
			} else {
				tmp += Character.toString(param.charAt(i));
			}

		}

		return answer + Integer.parseInt(tmp) * operator;
	}

}