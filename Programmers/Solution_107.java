import java.util.Scanner;

// 문제 : 직각삼각형 출력하기
// 결과 : 성공
// Score : 100
public class Solution_107 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
	}

}