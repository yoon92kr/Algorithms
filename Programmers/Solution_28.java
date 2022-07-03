import java.util.ArrayList;
import java.util.Arrays;

// 문제 : 나누어 떨어지는 숫자 배열
// 결과 : 성공
// Score : 100
public class Solution_28 {

	public int[] solution(int[] arr, int divisor) {
		return check(arr, divisor, arr.length);
	}

	int[] check(int[] arr, int divisor, int len) {
		Arrays.sort(arr);
		ArrayList<Integer> result = new ArrayList<Integer>();

		int last = arr[len - 1];
		if (divisor == 1) {
			return arr;
		} else if (divisor == last) {
			return new int[] { last };
		} else if (divisor < last) {
			for (int i = 0; i < len; i++) {
				if (arr[i] % divisor == 0)
					result.add(arr[i]);
			}
			return result.size() == 0 ? new int[] { -1 } : result.stream().mapToInt(i -> i).toArray();

		}

		return new int[] { -1 };
	}

}
