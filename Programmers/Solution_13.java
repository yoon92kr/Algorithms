import java.util.Arrays;

// 문제 : 완주하지 못한 선수
// 결과 : 성공
// Score : 100
public class Solution_13 {
	public String solution(String[] participant, String[] completion) {
		return checkFail(participant, completion, completion.length);
	}

	private String checkFail(String[] participant, String[] completion, int len) {

		Arrays.sort(participant);
		Arrays.sort(completion);

		for (int i = 0; i < len; i++) {
			if (!participant[i].equals(completion[i]))
				return participant[i];
		}

		return participant[len];
	}

}