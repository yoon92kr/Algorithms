import java.util.Arrays;
import java.util.stream.Collectors;

// 문제 : 중복된 문자 제거
// 결과 : 성공
// Score : 100
public class Solution_123 {

	public String solution(String param) {
		return Arrays.stream(param.split("")).distinct().collect(Collectors.joining());
	}

}