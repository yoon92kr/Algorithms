import java.util.Arrays;

// 문제 : 진료 순서 정하기
// 결과 : 성공
// Score : 100
public class Solution_143 {

	public int[] solution(int[] param) {
		
		int[] cpParam = param.clone();
		int[] result = new int[param.length];
		Arrays.sort(cpParam);

		for (int i = 0; i < param.length; i++) {
			
			for (int j = 0; j < param.length; j++) {
				
				if (param[i] == cpParam[param.length - j - 1]) {
					result[i] = j + 1;
					break;
				}
				
			}
			
		}

		return result;
	}

}
