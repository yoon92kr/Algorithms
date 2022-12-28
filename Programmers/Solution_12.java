// 문제 : 자릿수 더하기
// 결과 : 성공
// Score : 100
public class Solution_12 {
	
	public int solution(int n) {
		return sum(Integer.toString(n));
	}

	private int sum(String param) {
		int result = 0;

		for (int i = 0; i < param.length(); i++) {
			result += Character.getNumericValue(param.charAt(i));
		}

		return result;
	}
	
}
