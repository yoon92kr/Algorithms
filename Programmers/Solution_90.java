import java.util.Arrays;

// 문제 : 최댓값 만들기 (1)
// 결과 : 성공
// Score : 100
public class Solution_90 {

	public int solution(int[] param) {
		
		Arrays.sort(param);
		return param[param.length - 2] * param[param.length - 1];
		
	}

}
