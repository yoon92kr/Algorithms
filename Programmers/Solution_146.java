// 문제 : 구슬을 나누는 경우의 수
// 결과 : 성공
// Score : 100
public class Solution_146 {

	public long solution(int balls, int share) {
		share = Math.min(balls - share, share);

		if (share == 0)
			return 1L;

		long result = solution(balls - 1, share - 1);

		return (result * balls) / share;
	}

}