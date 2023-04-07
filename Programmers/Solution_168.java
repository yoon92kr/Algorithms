// 문제 : 콜라 문제
// 결과 : 성공
// Score : 100
public class Solution_168 {

	public int solution(int a, int b, int n) {
		if (n < a)
			return 0;
		return (n / a) * b + solution(a, b, (n / a) * b + n % a);
	}

}