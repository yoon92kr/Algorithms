// 문제 : 크기가 작은 부분문자열
// 결과 : 성공
// Score : 100
public class Solution_192 {

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