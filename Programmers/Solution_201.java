// 문제 : 추억 점수
// 결과 : 성공
// Score : 100

public class Solution_201 {

	public int[] solution(String[] key, int[] value, String[][] keyList) {
		
		int keyLen = key.length;
		int[] answer = new int[keyLen];
		
		for (int i = 0; i < keyLen; i++) {
			
			char flag = 'A';
			StringBuilder appendArray = new StringBuilder();
			
			for (int j = 0; j < keyList[i].length; j++) {
				appendArray.append(keyList[i][j]);
				appendArray.append("|");
			}

			String resultStr = new String(appendArray);

			for (int k = 0; k < keyLen; k++) {
				resultStr.replace(key[k], String.valueOf(flag + k));
			}

		}

		return answer;
    }

}