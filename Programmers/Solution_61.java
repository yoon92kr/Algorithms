// 문제 : 최댓값과 최솟값
// 결과 : 성공
// Score : 100
public class Solution_61 {

	public String solution(String param) {

		String[] paramArr = param.split(" ");
		int len = paramArr.length;
		int min = Integer.parseInt(paramArr[0]);
		int max = Integer.parseInt(paramArr[0]);

		for (int i = 0; i < len; i++) {
			int item = Integer.parseInt(paramArr[i]);
			min = min > item ? item : min;
			max = max < item ? item : max;
		}
		return Integer.toString(min) + " " + Integer.toString(max);
	}

}