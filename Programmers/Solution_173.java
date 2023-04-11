// 문제 : N개의 최소공배수
// 결과 : 성공
// Score : 100
public class Solution_173 {

	public int solution(int[] arr) {
		if (arr.length == 1) {
			return arr[0];
		}

		int lcm = (arr[0] * arr[1]) / gdc(arr[0], arr[1]);
		for (int i = 2; i < arr.length; i++) {
			lcm = (arr[i] * lcm) / gdc(arr[i], lcm);
		}
		return lcm;
	}

	int gdc(int num1, int num2) {
		return num2 == 0 ? num1 : gdc(num2, num1 % num2);
	}
}

/*
 * 두 수 a, b의 최대공약수 gcd
 * 두 수 a, b의 최소공배수 (a * b) / gcd
 */