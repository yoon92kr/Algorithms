// 문제 : 암호 해독
// 결과 : 성공
// Score : 100
public class Solution_121 {

	public String solution(String cipher, int code) {
		String answer = "";
		for (int i = code - 1; i < cipher.length(); i += code) {
			answer += cipher.charAt(i);
		}
		return answer;
	}

}