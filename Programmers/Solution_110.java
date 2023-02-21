// 문제 : 배열 두배 만들기
// 결과 : 성공
// Score : 100
public class Solution_110 {

	public int[] solution(int[] param) {
		int[] result = new int[param.length];
		for (int i = 0; i < param.length; i++) {
			result[i] = param[i] * 2;
		}
		return result;
	}

}