import java.util.Collections;

// 문제 : 수박수박수박수박수?
// 결과 : 성공
// Score : 100
public class Solution_8 {
	public String solution(int n) {

		if (n % 2 == 0) {
			return String.join("", Collections.nCopies(n / 2, "수박"));
		} else {
			return String.join("", Collections.nCopies((n + 1) / 2, "수박")).substring(0, n);
		}
	}

	public static void main(String[] args) {
		Solution_8 test = new Solution_8();
		String a = test.solution(9);
		System.out.println(a);
	}

}