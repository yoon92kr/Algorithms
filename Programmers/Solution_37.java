import java.util.Arrays;
import java.util.Collections;

// 문제 : 정수 내림차순으로 배치하기
// 결과 : 성공
// Score : 100
public class Solution_37 {

	public long solution(long param) {
		return revert(Long.toString(param).split(""));
	}

	long revert(String[] param) {
		Arrays.sort(param, Collections.reverseOrder());
		return Long.parseLong(String.join("", param));
	}

}
