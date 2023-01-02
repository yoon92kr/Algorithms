import java.util.HashMap;

// 문제 : 폰켓몬
// 결과 : 성공
// Score : 100
public class Solution_51 {
	public int solution(int[] param) {
		return getType(param, param.length);
	}

	int getType(int[] param, int len) {

		HashMap<Integer, Integer> checkList = new HashMap<Integer, Integer>();
		for (int i = 0; i < len; i++) {
			if (!checkList.containsKey(param[i])) {
				checkList.put(param[i], param[i]);
			}
		}

		int unique = checkList.size();
		int half = len / 2;

		return unique > half ? half : unique;
	}
}