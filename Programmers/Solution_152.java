// 문제 : 로그인 성공?
// 결과 : 성공
// Score : 100
public class Solution_152 {

	public String solution(String[] param, String[][] db) {

		for (int i = 0; i < db.length; i++) {
			if (db[i][0].equals(param[0])) {
				if (db[i][1].equals(param[1])) {
					return "login";
				} else {
					return "wrong pw";
				}
			}
		}

		return "fail";
	}

}