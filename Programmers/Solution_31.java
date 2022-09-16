import java.util.Arrays;
import java.util.Collections;

// 문제 : 문자열 내림차순으로 배치하기
// 결과 : 성공
// Score : 100
public class Solution_31 {

	public String solution(String s) {
		String[] sortArr = s.split("");
		Arrays.sort(sortArr, Collections.reverseOrder());
		return String.join("", sortArr);
	}
}
