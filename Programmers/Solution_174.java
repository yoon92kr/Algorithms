// 문제 : 예상 대진표
// 결과 : 성공
// Score : 100
public class Solution_174 {

	public int solution(int total, double userA, double userB) {
		int stage = 1;
		if (userA > userB) {
			double tmp = userA;
			userA = userB;
			userB = tmp;
		}

		while (true) {
			if (userA == userB || (userA % 2 == 1 & userB - userA == 1))
				break;
			userA = userA == 1 ? 1 : Math.ceil(userA / 2);
			userB = userB == 1 ? 1 : Math.ceil(userB / 2);
			stage++;
		}

		return stage;
	}

}