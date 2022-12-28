import java.lang.reflect.Field;

// 문제 : 성격 유형 검사하기
// 결과 : 성공
// Score : 100
public class Solution_16 {

	public String solution(String[] survey, int[] choices) {
		return checkMBTI(gradeMBTI(survey, choices, survey.length));
	}

	MBTI gradeMBTI(String[] survey, int[] choices, int len) {
		MBTI mbti = new MBTI();
		try {

			Class refMbti = Class.forName("MBTI");

			for (int i = 0; i < len; i++) {
				String[] question = survey[i].split("");
				int score = choices[i];

				if (score == 4) {
					continue;
				} else if (score < 4) {
					Field field = refMbti.getField(question[0]);
					field.set(mbti, (int) field.get(mbti) - (score - 4));
				} else {
					Field field = refMbti.getField(question[1]);
					field.set(mbti, (int) field.get(mbti) + score - 4);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return mbti;
	}

	String checkMBTI(MBTI mbti) {
		String answer = mbti.R >= mbti.T ? "R" : "T";
		answer += mbti.C >= mbti.F ? "C" : "F";
		answer += mbti.J >= mbti.M ? "J" : "M";
		answer += mbti.A >= mbti.N ? "A" : "N";

		return answer;
	}

}

class MBTI {
	public int R, T, C, F, J, M, A, N;
}
