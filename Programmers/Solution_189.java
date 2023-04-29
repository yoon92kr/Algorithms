import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// 문제 : 달리기 경주
// 결과 : 성공
// Score : 100
public class Solution_189 {

	public String[] solution(String[] players, String[] callings) {
		String[] answer = new String[players.length];

		Map<Integer, String> map = new TreeMap<>();
		Map<String, Integer> map2 = new HashMap<>();

		for (int i = 0; i < players.length; i++) {
			map.put(i + 1, players[i]);
			map2.put(players[i], i + 1);
		}

		for (int i = 0; i < callings.length; i++) {

			String call = callings[i];

			int idx = map2.get(call);

			String a = map.get(idx - 1);

			map2.put(call, idx - 1);
			map2.put(a, idx);

			map.put(idx - 1, call);
			map.put(idx, a);

		}

		int idx = 0;
		for (int key : map.keySet()) {
			answer[idx++] = map.get(key);
		}

		return answer;
	}

}