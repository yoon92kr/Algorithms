import java.util.ArrayList;

// 문제 : 소인수분해
// 결과 : 성공
// Score : 100
public class Solution_142 {

	public int[] solution(int param) {
		ArrayList<Integer> result = new ArrayList<>();
		int index = 2;

		while (param > 1) {
			if (param % index == 0) {
				if (!result.contains(index)) {
					result.add(index);
				}
				param = param / index;
			} else {
				index++;
			}
		}
		return result.stream().mapToInt(Integer::intValue).toArray();
	}

}
