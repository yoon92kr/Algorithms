import java.util.Arrays;

// 문제 : 문자열 내 마음대로 정렬하기
// 결과 : 성공
// Score : 100
public class Solution_46 {

	public String[] solution(String[] param, int index) {
		return sortCustom(sort(param), index, param.length);
	}

	String[] sort(String[] param) {
		Arrays.sort(param);
		return param;
	}

	String[] sortCustom(String[] param, int index, int len) {
		String[] result = new String[len];
		int arrIndex = 0;
		for (int i = 97; i <= 122; i++) {
			for (int j = 0; j < len; j++) {
				if (param[j].charAt(index) == i) {
					result[arrIndex] = param[j];
					arrIndex++;
				}
			}
		}
		return result;
	}
}