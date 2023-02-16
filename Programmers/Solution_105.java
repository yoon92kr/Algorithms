import java.util.Arrays;

// 문제 : n의 배수 고르기
// 결과 : 성공
// Score : 100
public class Solution_105 {

	public int[] solution(int target, int[] param) {
		return Arrays.stream(param).filter(i -> i % target == 0).toArray();
	}

}