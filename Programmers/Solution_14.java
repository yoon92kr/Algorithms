// 문제 : 로또의 최고 순위와 최저 순위
// 결과 : 성공
// Score : 100
public class Solution_14 {
	public int[] solution(int[] lottos, int[] win_nums) {
		int zero = zeroCnt(lottos);
		int match = matchCnt(lottos, win_nums);

		return new int[] { high(match, zero), low(match) };
	}

	private int zeroCnt(int[] lottos) {
		int result = 0;

		for (int i = 0; i < 6; i++) {
			result += lottos[i] == 0 ? 1 : 0;
		}

		return result;
	}

	private int matchCnt(int[] lottos, int[] win_nums) {
		int result = 0;

		for (int i = 0; i < 6; i++) {
			if (lottos[i] != 0) {

				for (int j = 0; j < 6; j++) {
					result += lottos[i] == win_nums[j] ? 1 : 0;
				}

			}
		}

		return result;
	}

	private int low(int match) {
		return match == 0 ? 6 : 7 - match;
	}

	private int high(int match, int zero) {
		return match == 0 & zero == 0 ? 6 : 7 - zero - match;
	}

}