import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// public class Main {
public class BAEKJOON_1152 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String param = br.readLine();

		if (param.equals(" ") || param.equals("")) {
			bw.write("0");
		} else {
			bw.write(Integer.toString(param.trim().split(" ").length));
		}

		bw.flush();
		bw.close();
		br.close();

	}
}