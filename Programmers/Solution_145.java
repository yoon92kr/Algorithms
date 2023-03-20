// 문제 : 숨어있는 숫자의 덧셈 (2)
// 결과 : 성공
// Score : 100
public class Solution_145 {

	public int solution(String param) {
		String[] splitParam = param.replaceAll("[a-z,A-Z]", ",").split(",");
		int reulst = 0;

		for (int i = 0; i < splitParam.length; i++) {
			if (!splitParam[i].equals("")) {
				reulst += Integer.valueOf(splitParam[i]);
			}
		}

		return reulst;
	}

}