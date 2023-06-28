// 문제 : 추억 점수

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Solution_225 {

    private final int MONTH = 28;
    private final int YEAR = 336;

    public int[] solution(String today, String[] terms, String[] privacies) {

        HashMap<String, Integer> rule = parseMap(terms, terms.length);
        ArrayList<Integer> result = new ArrayList<Integer>();
        String[] tmpValue;
        int anchor = dateValue(today);
        int runCnt = privacies.length;

        for (int i = 0; i < runCnt; i++) {
            tmpValue = privacies[i].split(" ");
            if (dateValue(tmpValue[0]) + rule.get(tmpValue[1]) <= anchor) {
                result.add(i + 1);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();

    }

    public HashMap<String, Integer> parseMap(String[] terms, int runCnt) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String[] tmpValue;

        for (int i = 0; i < runCnt; i++) {
            tmpValue = terms[i].split(" ");
            map.put(tmpValue[0], Integer.valueOf(tmpValue[1]) * MONTH);
        }

        return map;
    }

    private int dateValue(String date) {
        int[] tmpValue = Arrays.stream(date.split("\\.")).mapToInt(Integer::parseInt).toArray();
        return tmpValue[0] * YEAR + tmpValue[1] * MONTH + tmpValue[2];

    }

}
