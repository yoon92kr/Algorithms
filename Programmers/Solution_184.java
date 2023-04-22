import java.util.Stack;

// 문제 : 괄호 회전하기
// 결과 : 성공
// Score : 100
public class Solution_184 {

	public int solution(String param) {
		StringBuilder sb = new StringBuilder(param.replace(")", "*"));
		int len = sb.length();
		int result = 0;

		for (int i = 0; i < len; i++) {
			result += checkBrace(sb, len);
			sb.append(sb.charAt(0)).deleteCharAt(0);
		}

		return result;
	}

	public int checkBrace(StringBuilder sb, int len) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < len; i++) {
			char target = sb.charAt(i);
			if (target == '(' || target == '{' || target == '[') {
				stack.push(target);
			} else {
				if (stack.size() == 0) {
					return 0;
				} else {
					if (target - stack.pop() == 2) {
						continue;
					} else {
						return 0;
					}
				}
			}
		}
		return stack.size() > 0 ? 0 : 1;
	}

}