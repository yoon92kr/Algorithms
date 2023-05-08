// 문제 : 크기가 작은 부분문자열
// 결과 : 성공
// Score : 100
public class Solution_192 {

	public static int solution(String baseStr, String targetStr) {

		int targetLen = targetStr.length();
		int loopLen = baseStr.length() - targetLen + 1;
		long target = Long.parseLong(targetStr);
		int result = 0;

		for (int i = 0; i < loopLen; i++) {
			result += Long.parseLong(baseStr.substring(i, targetLen + i)) <= target ? 1 : 0;
		}

		return result;

	}

}
