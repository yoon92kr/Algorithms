import java.util.Scanner;

// public class Main {
public class BAEKJOON_2739 {
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		
		int param;

		param = scanner.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", param, i, param * i);
		}

		scanner.close();

	}
}
