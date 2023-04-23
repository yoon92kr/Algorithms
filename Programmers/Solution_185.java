import java.util.HashMap;

// 문제 : 위장
// 결과 : 성공
// Score : 100
public class Solution_185 {

	public int solution(String[][] clothes) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int result = 1;

		for (int i = 0; i < clothes.length; i++) {
			map.put(clothes[i][1], map.containsKey(clothes[i][1]) ? map.get(clothes[i][1]) + 1 : 1);
		}

		for (Integer value : map.values()) {
			result *= value + 1;
		}

		return result - 1;
	}

}
