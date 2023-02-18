import java.util.Arrays;

// 문제 : 문자열 정렬하기 (1)
// 결과 : 성공
// Score : 100
public class Solution_108 {

	public int[] solution(String param) {
		return parseArray(param.replaceAll("[a-z]", ""));
	}

	int[] parseArray(String param) {
		int len = param.length();
		int[] result = new int[len];
		for (int i = 0; i < len; i++) {
			result[i] = Character.getNumericValue(param.charAt(i));
		}
		Arrays.sort(result);
		return result;
	}

}