// 문제 : 숫자 문자열과 영단어
// 결과 : 성공
// Score : 100
public class Solution_18 {

	public int solution(String s) {
		try {
			return Integer.parseInt(s);
		} catch (Exception e) {
			return parseInt(s);
		}
	}

	int parseInt(String param) {
		String[] rule = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		
		for (int i = 0; i < 10; i++) {
			param = param.replace(rule[i], Integer.toString(i));
		}
		return Integer.parseInt(param);
	}
}
