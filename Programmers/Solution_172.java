import java.util.Arrays;

// 문제 : 구명보트
// 결과 : 성공
// Score : 100
public class Solution_172 {

	public int solution(int[] people, int limit) {
		Arrays.sort(people);
		int boat = 0;
		int maxIndex = people.length - 1;
		int minIndex = 0;

		while (maxIndex >= minIndex) {
			if (people[maxIndex--] + people[minIndex] <= limit)
				minIndex++;
			boat++;
		}

		return boat;

	}
}