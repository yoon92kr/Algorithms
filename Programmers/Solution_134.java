import java.util.stream.Collectors;
import java.util.stream.Stream;

// 문제 : 한 번만 등장한 문자
// 결과 : 성공
// Score : 100
public class Solution_134 {

	public String solution(String param) {
		param = Stream.of(param.split("")).sorted().collect(Collectors.joining());
		String result = "";

		for (int i = 97; i <= 122; i++) {
			String target = Character.toString((char) i);
			result += param.length() - param.replace(target, "").length() == 1 ? target : "";
		}
		return result;
	}

}