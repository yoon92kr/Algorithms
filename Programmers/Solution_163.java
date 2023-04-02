// 문제 : 다항식 더하기
// 결과 : 성공
// Score : 100
public class Solution_163 {

	public String solution(String param) {
		String[] paramArr = param.split(" \\+ ");
		int countX = 0;
		int count = 0;
		String result = "";

		for (int i = 0; i < paramArr.length; i++) {
			if (paramArr[i].indexOf("x") == -1) {
				count += Integer.parseInt(paramArr[i]);
			} else {
				countX += paramArr[i].length() > 1 ? Integer.parseInt(paramArr[i].replaceAll("x", "")) : 1;
			}
		}

		if (countX != 0) {
			result += countX == 1 ? "x" : Integer.toString(countX) + "x";
		}
		if (countX != 0 && count != 0) {
			result += " + ";
		}
		if (count != 0) {
			result += Integer.toString(count);
		}
		return result;
	}

}
