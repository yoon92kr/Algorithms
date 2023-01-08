// 문제 : 비밀지도
// 결과 : 성공
// Score : 100
public class Solution_58 {

	public String[] solution(int len, int[] map1, int[] map2) {
		String[] decode = new String[len];

		for (int i = 0; i < len; i++) {
			decode[i] = parseMap(parseBinary(map1[i] | map2[i]), len);
		}

		return decode;
	}

	String parseBinary(int param) {
		return Integer.toBinaryString(param);
	}

	String parseMap(String param, int len) {

		String result = param.length() != len ? getNull(len - param.length()) : "";

		for (int i = 0; i < param.length(); i++) {
			result += param.charAt(i) == '1' ? '#' : ' ';
		}
		return result;
	}

	String getNull(int param) {
		String result = "";
		for (int i = 0; i < param; i++) {
			result += " ";
		}
		return result;
	}

}