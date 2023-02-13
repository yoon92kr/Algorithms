// 문제 : 옷가게 할인 받기
// 결과 : 성공
// Score : 100
public class Solution_99 {

	public int solution(int param) {
		
		return (int) (param * (1 - discountRate(param)));
		
	}

	double discountRate(int param) {
		
		if (param >= 500000)
			return 0.2;
		else if (param >= 300000)
			return 0.1;
		else if (param >= 100000)
			return 0.05;

		return 0;
		
	}
}
