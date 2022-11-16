import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// 문제 : 신고결과받기
// 결과 : 시간 초과
// Score : 87.5
public class Solution_2 {

	public int[] solution(String[] id_list, String[] report, int k) {

		ArrayList<String> update_report = check_report(report, report.length);
		HashMap<String, Integer> black_list = set_black_user(update_report, update_report.size());
		return set_mail_count(id_list, update_report, black_list, id_list.length, k);
	}

	private static ArrayList<String> check_report(String[] report, int len) {
		ArrayList<String> result = new ArrayList<String>();
		Arrays.sort(report);
		String past = "";
		String target = "";

		for (int i = 0; i < len; i++) {
			target = report[i];
			if (!target.equals(past)) {
				result.add(target);
				past = target;
			}
		}

		return result;
	}

	private static HashMap<String, Integer> set_black_user(ArrayList<String> report, int len) {
		HashMap<String, Integer> result = new HashMap<String, Integer>();
		String target = "";
		for (int i = 0; i < len; i++) {
			target = report.get(i).split(" ")[1];
			if (result.get(target) == null) {
				result.put(target, 1);
			} else {
				result.put(target, result.get(target) + 1);
			}
		}

		return result;

	}

	private static int[] set_mail_count(String[] id_list, ArrayList<String> report,
			HashMap<String, Integer> black_list, int len, int max) {
		int[] result = new int[len];
		String user = "";
		int count = 0;

		for (int i = 0; i < len; i++) {
			user = id_list[i];
			count = 0;

			for (int j = 0; j < report.size(); j++) {
				String[] target = report.get(j).split(" ");

				if (user.equals(target[0]) && black_list.get(target[1]) >= max) {
					count++;
					report.remove(j);
					j--;
				}
			}
			result[i] = count;
		}
		return result;

	}

}