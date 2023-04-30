import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// 문제 : 달리기 경주
// 결과 : 성공
// Score : 100
public class Solution_189 {

	public String[] solution(String[] players, String[] callings) {
		String[] answer = new String[players.length];
		String target = "";
		String frontPlayer = "";
		int index = 0;
		Map<Integer, String> indexKey = new TreeMap<>();
		Map<String, Integer> playerKey = new HashMap<>();

		for (int i = 0; i < players.length; i++) {
			indexKey.put(i + 1, players[i]);
			playerKey.put(players[i], i + 1);
		}

		for (int i = 0; i < callings.length; i++) {
			target = callings[i];
			index = playerKey.get(target);
			frontPlayer = indexKey.get(index - 1);

			playerKey.put(target, index - 1);
			playerKey.put(frontPlayer, index);
			indexKey.put(index - 1, target);
			indexKey.put(index, frontPlayer);
		}

		index = 0;
		for (int key : indexKey.keySet()) {
			answer[index++] = indexKey.get(key);
		}

		return answer;
	}

}