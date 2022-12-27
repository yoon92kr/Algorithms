import java.util.Scanner;

// public class Main {
public class BAEKJOON_4470 {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int param;

		param = scanner.nextInt();
		String[] paramArray = new String[param];
		scanner.nextLine();
		for (int i = 0; i < param; i++) {
			paramArray[i] = scanner.nextLine();
		}

		for (int i = 0; i < param; i++) {
			System.out.printf("%d. %s\n", i + 1, paramArray[i]);
		}

		scanner.close();

	}
}