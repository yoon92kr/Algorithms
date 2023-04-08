import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

// 문제 : 숫자 짝꿍
// 결과 : 성공
// Score : 100
public class Solution_169 {

	public String solution(String X, String Y) {
		String result = "";

		for (int i = 0; i < 10; i++) {
			int Xl = X.length();
			int Yl = Y.length();
			X = X.replace(Integer.toString(i), "");
			Y = Y.replace(Integer.toString(i), "");
			int min = Math.min(Xl - X.length(), Yl - Y.length());
			result += min == 0 ? "" : mulString(Integer.toString(i), min);
		}

		if (result.length() == 0)
			return "-1";

		if (result.replace("0", "").length() == 0)
			return "0";

		return setDESC(result);
	}

	String mulString(String param, int count) {
		StringBuilder sb = new StringBuilder(count);
		for (int i = 0; i < count; i++) {
			sb.append(param);
		}
		return sb.toString();
	}

	String setDESC(String param) {
		return Arrays.stream(param.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
	}

}