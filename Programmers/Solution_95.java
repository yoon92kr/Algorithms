import java.util.Arrays;

// 문제 : 삼각형의 완성조건 (1)
// 결과 : 성공
// Score : 100
public class Solution_95 {

	public int solution(int[] param) {
		
		Arrays.sort(param);
		return param[2] < param[1] + param[0] ? 1 : 2;
		
	}

}
