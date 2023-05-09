// 문제 : 바탕화면 정리
// 결과 : 성공
// Score : 100
public class Solution_193 {

	private static final String FILE = "#";
	private static final int Y_START_INDEX = 0;
	private static final int X_START_INDEX = 1;
	private static final int[] BASE_RESULT = { 50, 50, 0, 0 }; // minY, minX, maxY, maxX

	public int[] solution(String[] wallPaper) {

		int height = wallPaper.length;
		int[] dragIndex = BASE_RESULT;

		for (int i = 0; i < height; i++) {

			if (wallPaper[i].contains(FILE)) {
				compareIndex(dragIndex, Y_START_INDEX, i, i);
				compareIndex(dragIndex, X_START_INDEX, wallPaper[i].indexOf(FILE), wallPaper[i].lastIndexOf(FILE));
			}

		}

		return dragIndex;

	}

	/**
	 * min or max index update
	 * 
	 * @param jobInfo
	 * @param commandData
	 */
	private void compareIndex(int[] dragIndex, int startIndex, int firstIndex, int lastIndex) {

		dragIndex[startIndex] = dragIndex[startIndex] > firstIndex ? firstIndex : dragIndex[startIndex];
		dragIndex[startIndex + 2] = dragIndex[startIndex + 2] <= lastIndex ? lastIndex + 1 : dragIndex[startIndex + 2];

	}

}