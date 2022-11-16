import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// 문제 : 신고결과받기
// 결과 : 실패
// Score : 33
public class Solution_3 {

	public int[] solution(String[] id_list, String[] report, int k) {

		ArrayList<String> update_report = check_report(report, report.length);
		String black_list = check_black_list(set_black_list(update_report, update_report.size()), k);
		ArrayList<String> last_report = set_report(update_report, black_list, update_report.size());

		return set_mail_count(id_list, last_report, id_list.length);
	}

	// 보고서의 중복 제거 함수
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

	// 신고당한 유저명과 신고횟수를 Map 형태로 변환
	private static HashMap<String, Integer> set_black_list(ArrayList<String> report, int len) {
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

	// 제제 기준에 해당하는 블랙 유저 확인
	private static String check_black_list(HashMap<String, Integer> report, int max) {
		String result = "";
		for (String key : report.keySet()) {
			System.out.println(key);
			if (report.get(key) >= max) {
				result += key + ",";
			}
		}
		return result;

	}

	// 블랙유저를 신고한 유저 리스트 확인
	private static ArrayList<String> set_report(ArrayList<String> report, String black_list, int len) {
		ArrayList<String> result = new ArrayList<String>();

		for (int i = 0; i < len; i++) {
			String[] target = report.get(i).split(" ");
			if (black_list.contains(target[1])) {
				result.add(target[0]);
			}
		}

		return result;
	}

	private static int[] set_mail_count(String[] id_list, ArrayList<String> report, int len) {
		int[] result = new int[len];
		String user = "";
		int count = 0;
		for (int i = 0; i < len; i++) {
			user = id_list[i];
			count = 0;

			for (int j = 0; j < report.size(); j++) {
				if (user.equals(report.get(j))) {
					count++;
				}
			}
			result[i] = count;
		}
		return result;

	}

	public static void main(String[] args) {
		Solution_3 test = new Solution_3();
		String[] id_list = { "ryan", "muzi", "frodo", "apeach", "neo", "yoon" };
		String[] report = { "ryan con", "ryan con", "ryan con", "ryan con", "muzi frodo", "apeach frodo", "frodo neo",
				"muzi neo", "apeach muzi", "apeach yoon", "ryan yoon" };
		int k = 2;
		System.out.println(Arrays.toString(test.solution(id_list, report, k)));
	}

}