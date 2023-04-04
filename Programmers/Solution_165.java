import java.util.Arrays;

// 문제 : 옹알이
// 결과 : 성공
// Score : 100
public class Solution_165 {

	final String[] WORD = { "aya", "ye", "woo", "ma" };

	public int solution(String[] param) {
		return (int) Arrays.stream(param).filter(i -> checkWord(replaceWord(i))).count();
	}

	// 발화 가능한 단어를 연산에 용이하도록 수정
	String replaceWord(String param) {
		for (int i = 0; i < 4; i++) {
			param = param.replace(WORD[i], Integer.toString(i));
		}

		return param;
	}

	// 연속된 단어, 발화 가능한 단어인지 확인
	boolean checkWord(String param) {
		if (param.replaceAll("[0-3]", "").length() == 0) {
			char target = param.charAt(0);

			for (int i = 1; i < param.length(); i++) {
				if (target == param.charAt(i)) {
					return false;
				} else {
					target = param.charAt(i);
				}
			}

			return true;
		}
		return false;
	}

}