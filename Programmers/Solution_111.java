import java.util.Arrays;

// 문제 : 중앙값 구하기
// 결과 : 성공
// Score : 100
public class Solution_111 {

	public int solution(int[] param) {
		Arrays.sort(param);
		return param[param.length / 2];
	}

}