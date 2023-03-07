// 문제 : 잘라서 배열로 저장하기
// 결과 : 성공
// Score : 100
public class Solution_130 {

	public String[] solution(String param, int n) {
		int paramLen = param.length();
		int len = (int) Math.ceil((double) paramLen / n);
		String[] result = new String[len];

		for (int i = 1; i <= len; i++) {
			result[i - 1] = i * n > paramLen ? param.substring((i - 1) * n) : param.substring((i - 1) * n, i * n);
		}
		return result;
	}

}