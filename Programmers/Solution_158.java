import java.util.Arrays;
import java.util.HashMap;

// 문제 : 최빈값 구하기
// 결과 : 성공
// Score : 100
public class Solution_158 {

	public int solution(int[] array) {
		
		int[] item = Arrays.stream(array).distinct().toArray();
		int[] count = new int[item.length];
		int result = 0;
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < item.length; i++) {
			for (int j = 0; j < array.length; j++) {
				count[i] += item[i] == array[j] ? 1 : 0;
			}
		}

		for (int i = 0; i < item.length; i++) {
			map.put(item[i], count[i]);
		}

		Arrays.sort(count);
		if (count.length != 1 && count[count.length - 1] == count[count.length - 2]) {
			return -1;
		}

		for (int key : map.keySet()) {
			if (count[count.length - 1] == map.get(key)) {
				result = key;
				break;
			}
		}

		return result;
	}

}
