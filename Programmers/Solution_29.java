// 문제 : 평균 구하기
// 결과 : 성공
// Score : 100
public class Solution_29 {

	public double solution(int[] arr) {
		return avg(arr, arr.length);
	}

	double avg(int[] arr, int len) {
		double result = 0;
		for (int i = 0; i < len; i++) {
			result += arr[i];
		}
		return result / len;
	}

}
