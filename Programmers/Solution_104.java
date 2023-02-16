// 문제 : 숨어있는 숫자의 덧셈 (1)
// 결과 : 성공
// Score : 100
public class Solution_104 {

	public int solution(String param) {
		return sumNum(param, param.length());
	}

	int sumNum(String param, int len) {
		int result = 0;
		for (int i = 0; i < len; i++) {
			result += param.charAt(i) < 58 ? Integer.parseInt(Character.toString(param.charAt(i))) : 0;
		}
		return result;
	}

}