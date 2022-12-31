// 문제 : 자연수 뒤집어 배열로 만들기
// 결과 : 성공
// Score : 100
public class Solution_45 {

	public int[] solution(long param) {
		return split(reverse(Long.toString(param)).split(""));
	}

	String reverse(String param) {
		StringBuffer sb = new StringBuffer(param);
		return sb.reverse().toString();
	}

	int[] split(String[] param) {
		int len = param.length;
		int[] result = new int[len];
		for (int i = 0; i < len; i++) {
			result[i] = Integer.parseInt(param[i]);
		}
		return result;
	}
}