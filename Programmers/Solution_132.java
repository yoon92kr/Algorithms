// 문제 : k의 개수
// 결과 : 성공
// Score : 100
public class Solution_132 {

	public int solution(int startIndex, int endIndex, int target) {
		String combine = "";
		for (int i = startIndex; i <= endIndex; i++) {
			combine += i;
		}

		return combine.length() - combine.replace(Integer.toString(target), "").length();
	}

}