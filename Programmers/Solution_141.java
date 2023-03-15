// 문제 : 영어가 싫어요
// 결과 : 성공
// Score : 100
public class Solution_141 {
	final String[] NUMBER = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

	public long solution(String param) {
		for (int i = 0; i < 10; i++) {
			param = param.replace(NUMBER[i], Integer.toString(i));
		}
		return Long.parseLong(param);
	}

}
