// 문제 : 문자열 밀기
// 결과 : 성공
// Score : 100
public class Solution_144 {

	public int solution(String originStr, String changeStr) {
		return (changeStr + changeStr).indexOf(originStr);
	}

}