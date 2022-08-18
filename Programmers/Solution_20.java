// 문제 : 없는 숫자 더하기
// 결과 : 성공
// Score : 100
public class Solution_20 {

	public int solution(int[] numbers) {
		return 45 - sum(numbers, numbers.length);
	}

	int sum(int[] numbers, int len) {
		int result = 0;
		for (int i = 0; i < len; i++) {
			result += numbers[i];
		}
		return result;
	}
}
