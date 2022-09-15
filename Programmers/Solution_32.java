// 문제 : 서울에서 김서방 찾기
// 결과 : 성공
// Score : 100
public class Solution_32 {

	public String solution(String[] seoul) {
		return String.format("김서방은 %s에 있다", searchKim(seoul, seoul.length));
	}

	String searchKim(String[] seoul, int len) {
		for (int i = 0; i < len; i++) {
			if (seoul[i].equals("Kim"))
				return Integer.toString(i);
		}
		return "1";
	}
}
