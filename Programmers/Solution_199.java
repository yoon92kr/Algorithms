// 문제 : n 번째 원소까지
// 결과 : 성공
// Score : 100

public class Solution_199 {

	public int[] solution(int[] num_list, int length) {
		
		int[] result = new int[length];

		for (int i = 0; i < length; i++) {
			
			result[i] = num_list[i];
			
		}

		return result;
	}

}
