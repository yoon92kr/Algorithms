import java.util.HashMap;

// 문제 : 영어 끝말잇기
// 결과 : 성공
// Score : 100
public class Solution_70 {

	public int[] solution(int param, String[] words) {

		HashMap<String, Integer> checkWord = new HashMap<String, Integer>();
		int len = words.length;
		int cycle = len / param;
		int[] result = new int[] { 0, 0 };

		for (int i = 1; i <= cycle; i++) {
			for (int j = 0; j < param; j++) {
				int target = (i - 1) * param + j;
				// 마지막 루프일경우 종료.
				if (len == target)
					break;

				// 앞 단어와 뒷 단어가 이어지지 않을 경우 결과를 리턴.
				if ((target != 0
						&& words[target - 1].charAt(words[target - 1].length() - 1) != words[target].charAt(0)))
					return new int[] { j + 1, i };

				System.out.println(checkWord.get("either"));
				if (checkWord.get(words[target]) == null) {
					checkWord.put(words[target], 1);
				} else {
					return new int[] { j + 1, i };
				}

			}
		}

		return result;
	}

}
