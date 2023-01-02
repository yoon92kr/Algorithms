import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// 문제 : 체육복
// 결과 : 성공
// Score : 100
public class Solution_50 {

	public int solution(int total, int[] lost, int[] reserve) {
		return total - lost.length + borrower(lost, reserve);
	}

	int borrower(int[] lost, int[] reserve) {
		Arrays.sort(lost);

		ArrayList<Integer> self = checkSelfExtra(lost, reserve);
		HashMap<Integer, Integer> lostMap = parseMap(lost);
		HashMap<Integer, Integer> reserveMap = parseMap(reserve);
		int result = self.size();

		for (int i = 0; i < self.size(); i++) {
			lostMap.remove(self.get(i));
			reserveMap.remove(self.get(i));
		}

		for (int key : lostMap.keySet()) {
			if (reserveMap.get(key - 1) != null) {
				result++;
				reserveMap.remove(key - 1);
				continue;
			}
			if (reserveMap.get(key + 1) != null) {
				result++;
				reserveMap.remove(key + 1);
			}
		}

		return result;
	}

	ArrayList<Integer> checkSelfExtra(int[] lost, int[] reserve) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					result.add(lost[i]);
				}
			}
		}

		return result;
	}

	HashMap<Integer, Integer> parseMap(int[] param) {
		HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
		for (int i = 0; i < param.length; i++) {
			result.put(param[i], param[i]);
		}
		return result;
	}

}