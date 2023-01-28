// 문제 : 중복된 숫자 개수
// 결과 : 성공
// Score : 100
public class Solution_81 {

	public int solution(int[] array, int param) {
		return getOverlap(array, param, array.length);
	}

	int getOverlap(int[] array, int param, int len) {
		int result = 0;
		for (int i = 0; i < len; i++) {
			if (array[i] == param)
				result++;
		}
		return result;
	}

}
