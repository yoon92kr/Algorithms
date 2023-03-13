// 문제 : 이진수 더하기
// 결과 : 성공
// Score : 100
public class Solution_138 {

	public String solution(String bin1, String bin2) {
		return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
	}

}