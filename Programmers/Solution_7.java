import java.util.ArrayList;

// 문제 : 소수 찾기
// 결과 : 성공
// Score : 정확성 75 효율성 25
public class Solution_7 {
	
	public int solution(int n) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);

		for (int i = 2; i <= n; i++) {

			if (check(i, arr, arr.size())) {
				arr.add(i);
			}
		}
		return arr.size();
	}

	private static boolean check(int n, ArrayList<Integer> arr, int len) {
		int root = (int) Math.sqrt(n);

		for (int i = 0; i < len; i++) {
			if (n % arr.get(i) == 0) {
				return false;
			}

			if (arr.get(i) > root) {
				return true;
			}
		}
		return true;
	}

}
