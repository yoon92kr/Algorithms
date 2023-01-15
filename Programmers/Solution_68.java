// 문제 : 다음 큰 숫자
// 결과 : 성공
// Score : 100
public class Solution_68 {

	public int solution(int param) {
		return getBigNum(param);
	}

	int getBigNum(int param) {
		int flag = countOne(Integer.toBinaryString(param));
		while (true) {
			if (flag == countOne(Integer.toBinaryString(++param)))
				return param;
		}

	}

	int countOne(String param) {
		return param.length() - param.replace("1", "").length();
	}

}