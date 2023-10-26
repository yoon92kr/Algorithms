// 문제 : 합승 택시 요금

import java.util.HashMap;

class Solution_328 {

    int[] minCost = { Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE };
    HashMap<Integer, HashMap<Integer, Integer>> faresMap;

    public int solution(int n, int s, int a, int b, int[][] fares) {

        initFaresMap(fares);
        HashMap<String, Integer> routeMap = new HashMap<String, Integer>();
        /* 루트 별 모든 비용 정보 추출 */
        getRouteCost(s, "", 0, routeMap);
        String routeA = String.format("[%d]", a);
        String routeB = String.format("[%d]", b);
        for (String key : routeMap.keySet()) {
            if (key.contains(routeA) && key.contains(routeB) && minCost[2] > routeMap.get(key)) {
                minCost[2] = routeMap.get(key);
            } else if (key.contains(routeA) && minCost[0] > routeMap.get(key)) {
                minCost[0] = routeMap.get(key);
            } else if (key.contains(routeA) && minCost[1] > routeMap.get(key)) {
                minCost[1] = routeMap.get(key);
            }
        }

        return Math.min(Math.min(minCost[2], minCost[3]), (minCost[0] + minCost[1]));

    }

    /* 모든 비용 정보를 HashMap 객체로 생성 {출발점, {도착점, 비용}} */
    private void initFaresMap(int[][] fares) {
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

        this.faresMap = faresMap;
    }

    /* 루트 별 비용 정보를 구하고, routeMap객체에 저장 {총 루트, 총 비용} */
    private void getRouteCost(int startIdx, String lastRoute, int cost, HashMap<String, Integer> routeMap) {
        lastRoute += String.format("[%d]", startIdx);
        routeMap.put(lastRoute, cost);
        HashMap<Integer, Integer> map = faresMap.get(startIdx);

        for (Integer key : map.keySet()) {
            if (!lastRoute.contains(String.format("[%d]", key))) {
                getRouteCost(key, lastRoute, cost + map.get(key), routeMap);
            }
        }
    }

}
