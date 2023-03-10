// 문제 : 종이 자르기
// 결과 : 성공
// Score : 100
public class Solution_133 {

	public int solution(int M, int N) {
		return M * N == 1 ? 1 : M * N - 1;
	}

}