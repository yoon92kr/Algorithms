// 문제 : OX퀴즈
// 결과 : 성공
// Score : 100
public class Solution_161 {

	public String[] solution(String[] quiz) {
		
		String[] answer = new String[quiz.length];

		for (int i = 0; i < quiz.length; i++) {
			String[] splitQA = quiz[i].split(" = ");
			String operator = splitQA[0].indexOf(" + ") != -1 ? " \\+ " : " - ";
			String[] splitQ = splitQA[0].split(operator);
			int x = Integer.parseInt(splitQ[0]);
			int y = Integer.parseInt(splitQ[1]);
			int z = Integer.parseInt(splitQA[1]);
			answer[i] = (operator == " \\+ " ? x + y : x - y) == z ? "O" : "X";
		}

		return answer;
	}

}
