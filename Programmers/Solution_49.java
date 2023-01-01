// 문제 : 부족한 금액 계산하기
// 결과 : 성공
// Score : 100
public class Solution_49 {

	public long solution(int price, int money, int count) {
		return count(price, money, count);
	}

	long math(int price, int count) {
		return price * count;
	}

	long count(int price, int money, int count) {
		long result = 0;
		for (int i = 1; i <= count; i++) {
			result += math(price, i);
		}
		return result > money ? result - money : 0;
	}

}