import java.util.Arrays;
import java.util.Comparator;

// 문제 : 최솟값 만들기
// 결과 : 성공
// Score : 100
public class Solution_65 {

	public int solution(int[] A, int[] B) {
		return multiplyArray(A, B, A.length);
	}

	int multiplyArray(int[] A, int[] B, int len) {
		
		int result = 0;
		Arrays.sort(A);
		Integer[] tmpB = Arrays.stream(B).boxed().toArray(Integer[]::new);
		Arrays.sort(tmpB, Comparator.reverseOrder());
		
		for (int i = 0; i < len; i++) {
			result += A[i] * tmpB[i];
		}
		
		return result;
		
	}

}
