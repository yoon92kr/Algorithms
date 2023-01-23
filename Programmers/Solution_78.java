// 문제 : 각도기
// 결과 : 성공
// Score : 100
public class Solution_78 {

	public int solution(int angle) {
		int result = 1;
		if (angle == 90)
			result = 2;
		else if (angle > 90 && angle < 180)
			result = 3;
		else if (angle == 180)
			result = 4;

		return result;
	}
}
