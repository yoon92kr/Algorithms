import java.util.Scanner;

// public class Main {
public class BAEKJOON_2438 {
	
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		int param;

		param = scanner.nextInt();

		for (int i = 1; i <= param; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println(' ');
		}

		scanner.close();
	}
}
