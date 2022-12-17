// 문제 : 핸드폰 번호 가리기
// 결과 : 성공
// Score : 100
public class Solution_38 {

	public String solution(String phone_number) {
		return privatePhoneNumber(phone_number, phone_number.length());
	}

	String privatePhoneNumber(String param, int len) {
		String result = len == 4 ? "" : getHash(len - 4);
		return result + param.substring(len - 4, len);
	}

	String getHash(int len) {
		String result = "";
		for (int i = 0; i < len; i++) {
			result += "*";
		}
		return result;
	}

}
