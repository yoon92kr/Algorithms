// 문제 : 최대공약수와 최소공배수
// 결과 : 성공
// Score : 100
public class Solution_41 {

	public int[] solution(int n, int m) {
		return n > m ? math(n, m) : math(m, n);
	}

	int[] math(int big, int small) {
		int cd = getCD(big, small);
		return new int[] { cd, big * small / cd };
	}

	int getCD(int big, int small) {
		int cd = 0;
		while (small != 0) {
			cd = big % small;
			big = small;
			small = cd;
		}
		return big;
	}

}
