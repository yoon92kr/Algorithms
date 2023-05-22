// 문제 : 카운트 업
// 결과 : 성공
// Score : 100

public class Solution_202 {

	public int[] solution(int start, int end) {

		int len = end - start + 1;
		int[] result = new int[len];
		
		for (int i = 0; i < len; i++) {
			result[i] = start + i;
		}
		
        return result;
    }

}