import java.util.HashMap;

// 문제 : 배열의 유사도
// 결과 : 성공
// Score : 100
public class Solution_91 {

	public int solution(String[] s1, String[] s2) {
		return getOverlap(s1, s2);
	}

	int getOverlap(String[] s1, String[] s2) {
		
		int count = 0;
		HashMap<String, Object> map = parseMap(s1, s1.length);
		for (int i = 0; i < s2.length; i++) {
			count += map.get(s2[i]) != null ? 1 : 0;
		}
		return count;
		
	}

	HashMap<String, Object> parseMap(String[] param, int len) {
		HashMap<String, Object> result = new HashMap<String, Object>();
		for (int i = 0; i < len; i++) {
			result.put(param[i], i);
		}
		return result;
	}

}
