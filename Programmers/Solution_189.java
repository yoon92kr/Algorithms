import java.util.ArrayList;
import java.util.Arrays;

// 문제 : 달리기 경주
// 결과 : 성공
// Score : 68
public class Solution_189 {

	public String[] solution(String[] players, String[] callings) {
		ArrayList<String> arrPlayers = new ArrayList<String>(Arrays.asList(players));
		int runCnt = callings.length;
		int index = 0;

		for (int i = 0; i < runCnt; i++) {
			index = arrPlayers.indexOf(callings[i]);
			arrPlayers.set(index, arrPlayers.get(index - 1));
			arrPlayers.set(index - 1, callings[i]);
		}

		return arrPlayers.toArray(new String[arrPlayers.size()]);
	}

}