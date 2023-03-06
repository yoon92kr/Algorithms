// 문제 : 2차원으로 만들기
// 결과 : 성공
// Score : 100
public class Solution_128 {

	public int[][] solution(int[] num_list, int n) {
		int len = num_list.length / n;
		int k = 0;
		int[][] result = new int[len][n];
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < n; j++) {
				result[i][j] = num_list[k++];
			}
		}
		return result;
	}

}