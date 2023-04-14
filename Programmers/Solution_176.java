import java.util.Arrays;

// 문제 : 과일 장수
// 결과 : 성공
// Score : 100
public class Solution_176 {

	public int solution(int k, int m, int[] score) {
		Arrays.sort(score);
		int price = 0;

		for (int i = score.length - 1; i >= m - 1; i -= m) {
			price += score[i - m + 1] * m;
		}

		return price;
	}

}
