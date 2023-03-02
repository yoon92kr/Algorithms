// 문제 : 주사위의 개수
// 결과 : 성공
// Score : 100
public class Solution_122 {

	public int solution(int[] box, int n) {
		return (box[0] / n) * (box[1] / n) * (box[2] / n);
	}

}