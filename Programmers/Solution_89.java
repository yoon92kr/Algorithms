import java.util.Arrays;

// 문제 : 자릿수 더하기
// 결과 : 성공
// Score : 100
public class Solution_89 {

	public int solution(int param) {
		return Arrays.stream(Integer.toString(param).split("")).mapToInt(i -> Integer.parseInt(i)).sum();
	}

}