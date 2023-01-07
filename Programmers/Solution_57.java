// 문제 : 실패율
// 결과 : 성공
// Score : 100
public class Solution_57 {

	public int[] solution(int max, int[] param) {

		return sort(checkRate(max, param, param.length), max);
	}

	double[][] checkRate(int max, int[] param, int len) {
		double[][] result = new double[max][2];

		for (int i = 1; i <= max; i++) {
			int tryCnt = 0;
			int failCnt = 0;
			for (int j = 0; j < len; j++) {
				if (param[j] >= i) {
					tryCnt++;
					if (param[j] == i) {
						failCnt++;
					}
				}
			}
			result[i - 1][0] = i;
			result[i - 1][1] = (double) failCnt / tryCnt;
		}
		return result;
	}

	int[] sort(double[][] param, int max) {

		double tmpRate;
		double tmpStage;
		for (int i = 0; i < max - 1; i++) {
			for (int j = 1; j < max - i; j++) {
				tmpStage = param[j - 1][0];
				tmpRate = param[j - 1][1];
				if (param[j - 1][1] > param[j][1]) {
					param[j - 1][0] = param[j][0];
					param[j - 1][1] = param[j][1];
					param[j][0] = tmpStage;
					param[j][1] = tmpRate;
				} else if (param[j - 1][1] == param[j][1] && param[j - 1][0] > param[j][0]) {
					param[j - 1][0] = param[j][0];
					param[j - 1][1] = param[j][1];
					param[j][0] = tmpStage;
					param[j][1] = tmpRate;
				}
			}
		}

		return parseArr(param, max);
	}

	int[] parseArr(double[][] param, int max) {
		int[] result = new int[max];
		for (int i = 0; i < max; i++) {
			result[i] = (int) param[i][0];
			System.out.println("tmpStage : " + param[i][0]);
			System.out.println("Rate : " + param[i][1]);
		}
		return result;
	}

	public static void main(String[] args) {
		int max = 5;
		int[] param = { 2, 1, 2, 6, 2, 4, 3, 3 };
		Solution_57 test = new Solution_57();
		test.solution(max, param);
	}

}