import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
public class BAEKJOON_2525 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nowTime = br.readLine().split(" ");
		int hour = Integer.parseInt(nowTime[0]);
		int minute = Integer.parseInt(nowTime[1]);
		int cookTime = Integer.parseInt(br.readLine());

		minute += cookTime;

		while (minute >= 60) {
			hour += 1;
			minute -= 60;
			while (hour > 23) {
				hour -= 24;
			}
		}

		System.out.printf("%d %d", hour, minute);

		br.close();

	}
}
