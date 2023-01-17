import java.util.Stack;

// 문제 : 짝지어 제거하기
// 결과 : 성공
// Score : 100
public class Solution_71 {

	public int solution(String param) {
		return param.length() % 2 == 1 ? 0 : removeWord(param, param.length());
	}

	int removeWord(String param, int len) {

		Stack<Character> result = new Stack<>();

		for (int i = 0; i < len; i++) {

			if (i + 1 != len && param.charAt(i) == param.charAt(i + 1)) {
				i++;
				continue;
			}

			if (!result.isEmpty() && result.peek() == param.charAt(i)) {
				result.pop();
				continue;
			}

			result.push(param.charAt(i));

		}

		return result.isEmpty() ? 1 : 0;

	}

}
