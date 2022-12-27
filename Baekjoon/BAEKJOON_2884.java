import java.io.BufferedReader;
import java.io.InputStreamReader;

// public class Main {
public class BAEKJOON_2884 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String param = br.readLine();

		String[] splitParam = param.split(" ");
		int hour, minute;

		hour = Integer.parseInt(splitParam[0]);
		minute = Integer.parseInt(splitParam[1]) - 45;

		if (minute < 0) {
			minute += 60;
			hour = hour - 1 < 0 ? 23 : hour - 1;
		}
		System.out.printf("%d %d", hour, minute);

		br.close();

	}
}
