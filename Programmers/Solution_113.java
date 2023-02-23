import java.util.stream.IntStream;

// 문제 : 약수 구하기
// 결과 : 성공
// Score : 100
public class Solution_113 {

	public int[] solution(int param) {
		return IntStream.range(1, param + 1).filter(i -> param % i == 0).toArray();
	}

}