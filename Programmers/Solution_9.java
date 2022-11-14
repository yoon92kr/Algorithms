import java.util.Arrays;

// 문제  : 제일 작은 수 제거하기
// 결과  : 성공
// Score : 100
public class Solution_9 {
	
	public int[] solution(int[] arr) {
		
		return arr.length == 1 ? new int[] { -1 } : set_array(arr, arr.length);
	}

	private int[] set_array(int[] arr, int len) {

		int index = get_index(arr, len);
		int[] result;

		if (index == 0)
			result = Arrays.copyOfRange(arr, 1, len);
		else if (index == len - 1) {
			result = Arrays.copyOfRange(arr, 0, len - 1);
		} else {
			result = set_arr(arr, index, len);
		}
		return result;
	}

	private int get_index(int[] arr, int len) {
		int min = Arrays.stream(arr).min().getAsInt();
		for (int i = 0; i < len; i++) {
			if (arr[i] == min) {
				return i;
			}
		}
		return 0;
	}

	private int[] set_arr(int[] arr, int index, int len) {
		int[] result = new int[len - 1];
		for (int i = 0; i < index; i++) {
			result[i] = arr[i];
		}
		for (int i = index; i < len - 1; i++) {
			result[i] = arr[i + 1];
		}
		return result;

	}

}
