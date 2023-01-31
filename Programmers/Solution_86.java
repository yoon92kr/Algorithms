// 문제 : 배열 자르기
// 결과 : 성공
// Score : 100
public class Solution_86 {

	public int[] solution(int[] param, int startIndex, int endIndex) {
		return subString(param, startIndex, endIndex - startIndex + 1);
	}

	int[] subString(int[] param, int startIndex, int len) {
		int[] result = new int[len];
		for (int i = 0; i < len; i++) {
			result[i] = param[i + startIndex];
		}
		return result;
	}

}