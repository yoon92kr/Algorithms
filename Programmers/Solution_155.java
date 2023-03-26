import java.util.PriorityQueue;

// 문제 : 명예의 전당 (1)
// 결과 : 성공
// Score : 100
public class Solution_155 {

	public static int[] solution(int k, int[] score) {
		int len = score.length;
		int[] result = new int[len];
		// 낮은 숫자가 우선 순위인 Queue
		PriorityQueue<Integer> pQueue = new PriorityQueue<>();

		for (int i = 0; i < len; i++) {
			pQueue.add(score[i]);
			if (pQueue.size() > k) {
				pQueue.remove();
			}
			result[i] = pQueue.peek();
		}

		return result;
	}
}