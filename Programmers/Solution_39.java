// 문제 : 행렬의 덧셈
// 결과 : 성공
// Score : 100
public class Solution_39 {

	public int[][] solution(int[][] arr1, int[][] arr2) {
		return sum(arr1, arr2, arr1.length, arr1[0].length);
	}

	int[][] sum(int[][] arr1, int[][] arr2, int len1, int len2) {
		int[][] result = new int[len1][len2];
		for (int i = 0; i < len1; i++) {
			for (int j = 0; j < len2; j++) {
				result[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return result;
	}

}
