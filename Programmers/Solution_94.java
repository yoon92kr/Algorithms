import java.util.stream.Collectors;
import java.util.stream.Stream;

// 문제 : 문자열 정렬하기 (2)
// 결과 : 성공
// Score : 100
public class Solution_94 {

	public String solution(String param) {
		
		return Stream.of(param.toLowerCase().split("")).sorted().collect(Collectors.joining());
		
	}

}
