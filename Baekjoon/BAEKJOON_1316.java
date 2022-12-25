import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// public class Main {
public class BAEKJOON_1316 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		String[] paramList = new String[count];
		String duplication = "";
		String past = "";
		int result = 0;

		for (int i = 0; i < count; i++) {
			paramList[i] = br.readLine();
		}

		for (int i = 0; i < count; i++) {
			String[] param = paramList[i].split("");
			duplication = "";

			for (int j = 0; j < param.length; j++) {
				// 최초 루프일경우 이전값과 중복값에 값을 대입한다.
				if (j == 0) {
					duplication += param[j];
					past = param[j];
				} else {
					// 이전값과 현재값이 같지 않을경우
					if (!past.equals(param[j])) {
						// 중복값에 현재값이 포함되어있다면 그룹단어가 아니라는 판단을 하며, 해당 루프를 종려한다.
						if (duplication.indexOf(param[j]) != -1) {
							break;
						} else {
							duplication += param[j];
							past = param[j];
						}
					}
				}

				if (j + 1 == param.length) {
					result++;
				}
			}
		}

		bw.write(Integer.toString(result));

		bw.flush();
		bw.close();
		br.close();

	}

}
