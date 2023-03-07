import java.util.Arrays;

// 문제 : A로 B 만들기
// 결과 : 성공
// Score : 100
public class Solution_129 {

	public int solution(String before, String after) {
		return check(before.split(""), after.split(""), after.length());
	}

	int check(String[] before, String[] after, int len) {
		Arrays.sort(before);
		Arrays.sort(after);
		for (int i = 0; i < len; i++) {
			if (!before[i].equals(after[i]))
				return 0;
		}
		return 1;
	}

}