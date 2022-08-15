import java.util.Arrays;

// 문제 : 두 개 뽑아서 더하기
// 결과 : 성공
// Score : 100
public class Solution_23 {

	public int[] solution(int[] array, int[][] commands) {
		return result(array, commands, commands.length);
	}

	int[] result(int[] array, int[][] commands, int len) {
		int[] result = new int[len];

		for (int i = 0; i < len; i++) {
			int[] tmp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
			Arrays.sort(tmp);
			result[i] = tmp[commands[i][2] - 1];
		}

		return result;
	}

}
