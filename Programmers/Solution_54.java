import java.util.Arrays;

// 문제 : 예산
// 결과 : 성공
// Score : 100
public class Solution_54 {

	public int solution(int[] request, int budget) {
		return checkBudget(request, budget, request.length, sum(request, request.length));
	}

	int sum(int[] param, int len) {
		int result = 0;
		for (int i = 0; i < len; i++) {
			result += param[i];
		}
		return result;
	}

	int checkBudget(int[] request, int budget, int len, int sum) {
		if (sum > budget) {
			Arrays.sort(request);
			for (int i = len - 1; i >= 0; i--) {
				sum -= request[i];
				len--;
				if (sum <= budget)
					break;
			}
		}

		return len;
	}

}