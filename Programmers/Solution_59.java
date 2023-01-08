// 문제 : 다트 게임
// 결과 : 성공
// Score : 100
public class Solution_59 {

	final int CHANCE = 3;
	public int FLAG = 1;

	public int solution(String param) {
		return sumScore(splitScore(param, param.length()));
	}

	int sumScore(String[] param) {
		int finalScore = 0;
		for (int i = CHANCE - 1; i > -1; i--) {
			finalScore += getScroe(param[i], param[i].length());
		}
		return finalScore;
	}

	String[] splitScore(String param, int len) {
		String[] scores = new String[CHANCE];
		int arrI = 0;
		int lastI = 0;
		int flag = 0;

		for (int i = 1; i <= len; i++) {
			if (param.charAt(i - 1) > 65) { // S, D, T 일 경우

				flag = i != len && param.charAt(i) < 47 ? 1 : 0; // 마지막 index가 아니고, 다음 index가 #, * 일 경우
				scores[arrI] = param.substring(lastI, i + flag);
				arrI++;
				lastI = i + flag;
			}
		}
		return scores;
	}

	int getScroe(String param, int len) {
		int score = 0;
		char bonus = 'S';
		char option = '-';

		for (int i = 0; i < len; i++) {
			if (param.charAt(i) > 65) {
				score = Integer.parseInt(param.substring(0, i));
				bonus = param.charAt(i);
				option = i != len - 1 ? param.charAt(i + 1) : '-';
				break;
			}
		}
		score = (int) Math.pow(score, getBonus(bonus)) * checkOption(option) * FLAG;
		FLAG = option == '*' ? 2 : 1;
		return score;
	}

	int getBonus(char param) {
		int result = 1;

		if (param == 'D') {
			result = 2;
		} else if (param == 'T') {
			result = 3;
		}
		return result;
	}

	int checkOption(char param) {
		int result = 1;

		if (param == '#') {
			result = -1;
		} else if (param == '*') {
			result = 2;
		}

		return result;
	}

	public static void main(String[] args) {
		String param = "1S2D*3T";
		Solution_59 test = new Solution_59();
		System.out.println(test.solution(param));
	}

}