// 문제 : 문자 반복 출력하기
// 결과 : 성공
// Score : 100
public class Solution_103 {

	public String solution(String param, int n) {
		return repeat(param, n, param.length());
	}

	String repeat(String param, int n, int len) {
		String result = "";
		
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < n; j++) {
				result += param.charAt(i);
			}
			
		}
		return result;
	}

}
