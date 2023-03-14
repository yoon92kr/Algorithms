// 문제 : 공 던지기
// 결과 : 성공
// Score : 100
public class Solution_139 {

	public int solution(int[] numbers, int k) {
		return numbers[2 * (k - 1) % numbers.length];
	}

}
