import java.util.ArrayList;
import java.util.Collections;

// 문제 : 두 개 뽑아서 더하기
// 결과 : 성공
// Score : 100
public class Solution_22 {

	public int[] solution(int[] numbers) {
		return sum(numbers, numbers.length);
	}

	int[] sum(int[] numbers, int len) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (result.indexOf(numbers[i] + numbers[j]) == -1)
					result.add(numbers[i] + numbers[j]);
			}
		}
		Collections.sort(result);
		return parseArray(result, result.size());
	}

	int[] parseArray(ArrayList<Integer> arrayList, int len) {
		int[] result = new int[len];

		for (int i = 0; i < len; i++) {
			result[i] = arrayList.get(i);
		}
		return result;
	}

}
