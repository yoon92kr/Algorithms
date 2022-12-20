// 문제 : 정수 제곱근 판별
// 결과 : 성공
// Score : 100
public class Solution_42 {

	public long solution(long param) {
		return check(Math.sqrt(param));
	}

	long check(double paramD) {
		return paramD != (int) paramD ? -1 : ((long) paramD + 1) * ((long) paramD + 1);
	}

}
