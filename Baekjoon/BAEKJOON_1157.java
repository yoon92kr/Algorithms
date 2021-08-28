import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// public class Main {
public class BAEKJOON_1157 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String param = br.readLine().toUpperCase();
		char target = 'A';
		int Maxcount = 0;
		int count = 0;
		char MaxChar = ' ';
		for (int i = 0; i < 26; i++) {
			count = param.length() - param.replace(String.valueOf(target), "").length();

			if (count > Maxcount) {
				MaxChar = target;
				Maxcount = count;
			} else if (count == Maxcount) {
				MaxChar = '?';
				Maxcount = count;
			}
			target++;
		}

		bw.write(Character.toString(MaxChar));

		bw.flush();
		bw.close();
		br.close();

	}
}