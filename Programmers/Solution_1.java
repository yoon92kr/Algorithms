import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

// 문제 : 신고결과받기
// 결과 : 시간 초과
// Score : 100
public class Solution_1 {

	public int[] solution(String[] id_list, String[] report, int k) {

		// 중복 신고 제거를 위한 Array > HashSet > Array 변형
		String[] update_report = new HashSet<>(Arrays.asList(report)).toArray(new String[0]);

		int user_num = id_list.length; // 반복문 속도 향상을 위한 flag 값 변수 생성
		int report_num = update_report.length; // 반복문 속도 향상을 위한 flag 값 변수 생성
		int[] answer = new int[user_num]; // 결과를 반환할 배열객체 생성
		HashMap<String, Integer> black_user = new HashMap<String, Integer>(); // 신고당한 유저 Map (신고된 유저 , 횟수)

		// Balck 유저 Map Set
		for (int i = 0; i < report_num; i++) {
			String target = update_report[i].split(" ")[1];
			if (black_user.get(target) == null) {
				black_user.put(target, 1);
			} else {
				black_user.put(target, black_user.get(target) + 1);
			}

		}

		// 받아야 할 Mail 횟수 측정
		for (int i = 0; i < user_num; i++) {
			String user = id_list[i]; // 현재 Loop의 User Set
			int mail_count = 0; // 메일 발송 횟수 초기화

			for (int j = 0; j < report_num; j++) {
				String[] target = update_report[j].split(" ");

				// 신고자와 User가 동일하며 신고당한 유저의 횟수가 k 이상일 경우 분기
				if (user.equals(target[0]) && black_user.get(target[1]) >= k) {
					mail_count++;
				}
			}
			answer[i] = mail_count;
		}
		return answer;
	}

}