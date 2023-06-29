// 문제 : 추억 점수

import java.util.HashMap;

class Solution_225 {

    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        HashMap<String, Integer> score = parseMap(name, yearning, name.length);
        int runCnt = photo.length;
        int peopleCnt, photoScore;
        int[] result = new int[runCnt];

        for (int i = 0; i < runCnt; i++) {
            peopleCnt = photo[i].length;
            photoScore = 0;

            for (int j = 0; j < peopleCnt; j++) {
                photoScore += score.containsKey(photo[i][j]) ? score.get(photo[i][j]) : 0;
            }

            result[i] = photoScore;
        }

        return result;

    }

    private HashMap<String, Integer> parseMap(String[] key, int[] value, int length) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < length; i++) {
            map.put(key[i], value[i]);
        }

        return map;

    }

}
