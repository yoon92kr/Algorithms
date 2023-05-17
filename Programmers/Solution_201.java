// 문제 : 추억 점수
// 결과 : 성공
// Score : 100

public class Solution_201 {

	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] result = new int[photo.length];

		for (int i = 0; i < photo.length; i++) {
			String strArray = convertStr(photo[i]);

			for (int j = 0; j < name.length; j++) {
				strArray.replaceAll(name[j], String.valueOf(yearning[j]));
			}
			strArray.replaceAll("/^[a-z]*$/", "0");
			System.out.println(strArray);
			result[i] = sumArray(strArray);
		}

		return result;
	}

	private int sumArray(String strArray) {
		int result = 0;
		String[] array = strArray.split(",");
		for (int i = 0; i < array.length; i++) {
			result += Integer.valueOf(array[i]);
		}
		return result;
	}

	private String convertStr(String[] array) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < array.length; i++) {
			if (i != 0 || i != array.length) {
				result.append("|");
			}
			result.append(array[i]);
		}

		return result.toString();
	}

}