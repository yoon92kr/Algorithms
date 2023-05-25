// 문제 : flag에 따라 다른 값 반환하기
// 결과 : 성공
// Score : 100

public class Solution_203 {

	public int solution(int a, int b, boolean flag) {
        
		return flag ? a + b : a - b;

    }

}