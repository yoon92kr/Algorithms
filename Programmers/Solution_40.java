// 문제 : 하샤드 수
// 결과 : 성공
// Score : 100
public class Solution_40 {

	public boolean solution(int param) {
		return hsd(param, Integer.toString(param)) == 0;
	}

	int hsd(int paramI, String paramS) {
		int hsd = 0;
		for (int i = 0; i < paramS.length(); i++) {
			hsd += Character.getNumericValue(paramS.charAt(i));
		}
		return paramI % hsd;
	}

}
