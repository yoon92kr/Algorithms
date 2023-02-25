// 문제 : 숫자 찾기
// 결과 : 성공
// Score : 100
public class Solution_116 {

	public int solution(int num, int k) {
		int result = Integer.toString(num).indexOf(Integer.toString(k));
		return result != -1 ? ++result : -1;
	}

}