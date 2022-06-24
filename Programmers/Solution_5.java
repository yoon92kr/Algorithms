import java.util.ArrayList;

// 문제 : 같은 숫자는 싫어
// 결과 : 성공
// Score : 정확성 71.9 효율성 28.1
public class Solution_5 {
	public int[] solution(int[] arr) {

		return check_array(arr, arr.length);
	}

	private static int[] check_array(int[] arr, int len) {
		int target = 10;
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		for (int i = 0; i < len; i++) {
			if (target != arr[i]) {
				tmp.add(arr[i]);
			}
			target = arr[i];
		}
		int size = tmp.size();
		int[] result = new int[size];

		for (int i = 0; i < size; i++) {
			result[i] = tmp.get(i);
		}

		return result;
	}
}