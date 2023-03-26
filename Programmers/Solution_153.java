import java.util.Stack;

// 문제 : 컨트롤 제트
// 결과 : 성공
// Score : 100
public class Solution_153 {

	public int solution(String param) {
		int result = 0;
		Stack<Integer> stack = new Stack<>();

		for (String item : param.split(" ")) {
			if (item.equals("Z"))
				stack.pop();
			else
				stack.push(Integer.valueOf(item));
		}

		while (stack.size() > 0)
			result += stack.pop();

		return result;
	}

}