// 문제 : 카펫
// 결과 : 성공
// Score : 100
public class Solution_69 {

	public int[] solution(int brown, int yellow) {
		int width = 0;
		int height;

		while (true) {
			width++;
			if (yellow % width != 0)
				continue;

			height = yellow / width;
			if ((width + height) * 2 + 4 == brown)
				return new int[] { Math.max(width, height) + 2, Math.min(width, height) + 2 };
		}
	}

}