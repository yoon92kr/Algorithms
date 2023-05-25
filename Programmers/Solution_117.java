// 문제 : 배열 회전시키기
// 결과 : 성공
// Score : 100
public class Solution_117 {

	public int[] solution(int[] param, String target) {
		
		int len = param.length;
		int[] result = new int[len];

		if (target.equals("right")) {
			result[0] = param[len - 1];
			
			for (int i = 0; i < len - 1; i++) {
				result[i + 1] = param[i];
			}
			
		} else {
			result[len - 1] = param[0];
			
			for (int i = 0; i < len - 1; i++) {
				result[i] = param[i + 1];
			}
			
		}

		return result;
	}

}
