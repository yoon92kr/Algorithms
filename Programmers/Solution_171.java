import java.util.Arrays;

// 문제 : 햄버거 만들기
// 결과 : 성공
// Score : 100
public class Solution_171 {

	public int solution(int[] ingredient) {
		return countBuger(Arrays.toString(ingredient).replace(" ,", ""));
	}

	// 문자열 내 "1231" 갯수 Count
	int countBuger(String param) {
		int result = 0;
		StringBuilder sb = new StringBuilder(param);
		while (sb.indexOf("1231") != -1) {
			int index = sb.indexOf("1231");
			sb.delete(index, index + 4);
			result++;
		}
		return result;
	}
}
