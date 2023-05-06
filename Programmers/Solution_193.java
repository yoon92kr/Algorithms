// 문제 : 바탕화면 정리
// 결과 : 성공
// Score : 100
public class Solution_193 {

	public static int solution(String t, String p) {
		int len = p.length();
		long num = Long.parseLong(p);
		int answer = 0;

		for (int i = 0; i <= t.length() - len; i++) {
			if (Long.parseLong(t.substring(i, i + len)) <= num) {
				answer++;
			}
		}

		return answer;
	}

}