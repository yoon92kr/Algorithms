// 문제 : 인덱스 바꾸기
// 결과 : 성공
// Score : 100
public class Solution_115 {

	public String solution(String param, int num1, int num2) {
		StringBuilder sb = new StringBuilder(param);
		char char1 = param.charAt(num1);
		char char2 = param.charAt(num2);
		sb.setCharAt(num1, char2);
		sb.setCharAt(num2, char1);
		return sb.toString();
	}

}