// 문제 : 음양 더하기
// 결과 : 성공
// Score : 100
public class Solution_19 {

	public int solution(int[] absolutes, boolean[] signs) {
		return math(absolutes, signs, absolutes.length);
	}

	int math(int[] absolutes, boolean[] signs, int len) {
		int result = 0;
		for (int i = 0; i < len; i++) {
			result += signs[i] == true ? absolutes[i] : -absolutes[i];
		}
		return result;
	}

}
