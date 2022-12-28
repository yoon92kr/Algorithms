// 문제 : 신규 아이디 추천
// 결과 : 성공
// Score : 100
public class Solution_17 {

	public String solution(String new_id) {

		String update_id = replace("[~!@#$%^&*()=+\\[{\\]}:?,<>\\/]", lowerCase(new_id), ""); // level 1,2
		update_id = replace("\\.{2,}", update_id, "."); // level 3
		update_id = checkNull(replace("\\.$", replace("^\\.", update_id, ""), "")); // level 4, 5
		update_id = replace("\\.$", overLen(update_id, update_id.length()), ""); // level 6

		return minLen(update_id, update_id.length());
	}

	String lowerCase(String param) {
		return param.toLowerCase();
	}

	String replace(String regex, String param, String replacement) {
		return param.replaceAll(regex, replacement);
	}

	String checkNull(String param) {
		if (param.equals("")) {
			return "a";
		}
		return param;
	}

	String overLen(String param, int len) {
		if (len >= 16) {
			return param.substring(0, 15);
		}

		return param;
	}

	String minLen(String param, int len) {
		char target = param.charAt(len - 1);
		while (len < 3) {
			param += target;
			len++;
		}

		return param;
	}

}
