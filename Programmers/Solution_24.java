import java.util.ArrayList;

// 문제 : 모의고사
// 결과 : 성공
// Score : 100
public class Solution_24 {

	int[] ruleA = { 5, 1, 2, 3, 4 };
	int[] ruleB = { 5, 1, 3, 4, };
	int[] ruleC = { 5, 3, 3, 1, 1, 2, 2, 4, 4, 5 };

	public int[] solution(int[] answers) {
		return check(answers, answers.length);
	}

	int[] check(int[] answer, int len) {
		int scoreA = 0;
		int scoreB = 0;
		int scoreC = 0;

		for (int i = 0; i < len; i++) {
			if (checkA(answer[i], i + 1))
				scoreA++;
			if (checkB(answer[i], i + 1))
				scoreB++;
			if (checkC(answer[i], i + 1))
				scoreC++;
		}

		return rank(new int[] { scoreA, scoreB, scoreC });
	}

	boolean checkA(int answer, int no) {
		return answer == ruleA[no % 5];
	}

	boolean checkB(int answer, int no) {
		return answer == ((no % 8) % 2 == 1 ? 2 : ruleB[(no % 8) / 2]);
	}

	boolean checkC(int answer, int no) {
		return answer == ruleC[no % 10];
	}

	int[] rank(int[] score) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		int max = 0;

		for (int i = 0; i < 3; i++) {
			max = score[i] > max ? score[i] : max;
		}

		for (int i = 0; i < 3; i++) {
			if (score[i] == max)
				array.add(i + 1);
		}

		int[] result = new int[array.size()];

		for (int i = 0; i < array.size(); i++) {
			result[i] = array.get(i);
		}

		return result;
	}

}
