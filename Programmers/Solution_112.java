// 문제 : 가위 바위 보
// 결과 : 성공
// Score : 100
public class Solution_112 {

	final int ROCK = 0;
	final int SCISSORS = 2;
	final int PAPER = 5;

	public String solution(String param) {
		String result = "";

		for (int i = 0; i < param.length(); i++) {

			int target = Character.getNumericValue(param.charAt(i));
			switch (target) {
				case ROCK:
					result += PAPER;
					break;
				case PAPER:
					result += SCISSORS;
					break;
				case SCISSORS:
					result += ROCK;
					break;
			}

		}

		return result;
	}

}