// 문제 : 푸드 파이트 대회
// 결과 : 성공
// Score : 100
public class Solution_177 {

	public String solution(int[] food) {
		StringBuffer str = new StringBuffer();
		for (int i = 1; i < food.length; i++) {
			for (int j = 0; j < food[i] / 2; j++) {
				str.append(i);
			}
		}
		StringBuffer rSTr = new StringBuffer(str);
		str.append("0");
		str.append(rSTr.reverse());
		return str.toString();
	}

}
