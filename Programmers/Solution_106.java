// 문제 : 7의 개수
// 결과 : 성공
// Score : 100
public class Solution_106 {

	public int solution(int[] param) {
		return countSeven(param, param.length);
	}

	int countSeven(int[] param, int len) {
		String result = "";
		for (int i = 0; i < len; i++) {
			result += param[i];
		}
		return result.length() - result.replace("7", "").length();
	}

}