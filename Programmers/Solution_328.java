// 문제 : 합승 택시 요금

import java.util.HashMap;

class Solution_328 {

    int[] minCost = { Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE };

    public int solution(int n, int s, int a, int b, int[][] fares) {

        HashMap<Integer, HashMap<Integer, Integer>> faresMap = initFaresMap(fares);

        /* S → A 최소비용 추출 */

        /* S → B 최소비용 추출 */

        /* S → A → B 최소비용 추출 */

        /* S → B → A 최소비용 추출 */

        return Math.min(Math.min(minCost[2], minCost[3]), (minCost[0] + minCost[1]));

    }

    /* 모든 비용 정보를 HashMap 객체로 생성 {출발점, {도착점, 비용}} */
    private HashMap<Integer, HashMap<Integer, Integer>> initFaresMap(int[][] fares) {
        HashMap<Integer, HashMap<Integer, Integer>> faresMap = new HashMap<Integer, HashMap<Integer, Integer>>();
        int runCnt = fares.length;

        for (int i = 0; i < runCnt; i++) {

            for (int j = 0; j < 2; j++) {
                if (faresMap.containsKey(fares[i][j])) {
                    faresMap.get(fares[i][j]).put(fares[i][j ^ 1], fares[i][2]);
                } else {
                    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
                    map.put(fares[i][j ^ 1], fares[i][2]);
                    faresMap.put(fares[i][j], map);
                }
            }
        }

        return faresMap;
    }

}
