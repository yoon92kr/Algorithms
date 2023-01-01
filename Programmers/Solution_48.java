// 문제 : 콜라츠 추측
// 결과 : 성공
// Score : 100
public class Solution_48 {

	public int solution(int param) {
		return collatz(param);
	}

	int collatz(int param) {
		int count = 0;
		long tmp = param;
		while (tmp != 1) {
			tmp = rule(tmp);
			count++;

			if (count == 500) {
				count = -1;
				break;
			}
		}
		return count;
	}

	long rule(long param) {
		return param % 2 == 0 ? param / 2 : (param * 3) + 1;
	}

}