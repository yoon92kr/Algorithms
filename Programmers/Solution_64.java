// 문제 : 이진 변환 반복하기
// 결과 : 성공
// Score : 100
public class Solution_64 {
	int zeroCnt = 0;
	int runCnt = 0;

	public int[] solution(String param) {
		while (!param.equals("1")) {
			param = parseBinary(removeZero(param, param.length()));
		}

		return new int[] { runCnt, zeroCnt };
	}

	int removeZero(String param, int len) {
		param = param.replace("0", "");
		zeroCnt += len - param.length();
		runCnt++;
		return param.length();
	}

	String parseBinary(int param) {
		return Integer.toBinaryString(param);
	}

}