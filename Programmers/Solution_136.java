// 문제 : 팩토리얼
// 결과 : 성공
// Score : 100
public class Solution_136 {

	public int solution(int param) {
		int result = 0;
		int index = 0;
		while (result <= param) {
			index++;
			result = factorial(index);
		}
		return index - 1;
	}

	int factorial(int param) {
		if (param == 0)
			return 1;

		return param * factorial(param - 1);
	}

	public static void main(String[] args) {
		Solution_136 test = new Solution_136();
		test.solution(7);
	}

}