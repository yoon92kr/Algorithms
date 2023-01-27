import java.util.Arrays;

// 문제 : 배열의 평균값
// 결과 : 성공
// Score : 100
public class Solution_80 {

	public double solution(int[] numbers) {
		return Arrays.stream(numbers).average().orElse(0);
	}
}
