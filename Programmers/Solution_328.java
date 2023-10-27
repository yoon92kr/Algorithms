// 문제 : 합승 택시 요금

class Solution_328 {

    public int solution(int pointCnt, int startPoint, int destA, int destB, int[][] fares) {
        int[][] routeArr = initRouteArr(fares, fares.length, pointCnt);
        int index, cost, minCost = 20000000;
        boolean[] isCheck;

        /* 2. 다익스트라 알고리즘을 이용한 지점 간 이동 시 최소 비용 갱신 */
        for (int i = 0; i < pointCnt; i++) {
            // 2.1 지점 확인 여부 초기화
            isCheck = new boolean[pointCnt];
            // 제자리 지점은 확인하지 않도록 설정
            isCheck[i] = true;

            for (int j = 0; j < pointCnt; j++) {
                // 2.2 확인하지 않은 지점 중 최소의 비용으로 이동할 수 있는 지점 탐색
                index = nextIdx(routeArr, i, pointCnt, isCheck);
                // 확인할 지점의 금액 산출
                cost = routeArr[i][index];

                for (int k = 0; k < pointCnt; k++) {
                    // 2.3 확인할 지점의 비용 + 지점에서의 이동 비용이 기준점에서 이동 비용보다 작을 경우 갱신
                    if (routeArr[k][index] + cost < routeArr[i][k]) {
                        routeArr[i][k] = routeArr[k][index] + cost;
                    }
                }
            }
        }

        /* 3. 각 지점을 중간 지점으로 설정한 뒤, 목적지점 A,B로 이동하는 최소 비용 추출 */
        for (int i = 0; i < pointCnt; i++) {
            cost = routeArr[startPoint - 1][i] + routeArr[i][destA - 1] + routeArr[i][destB - 1];
            if (cost < minCost) {
                minCost = cost;
            }
        }

        return minCost;
    }

    /* 1. 지점 별 이동 비용를 2차원 배열 형태로 재정의 */
    private int[][] initRouteArr(int[][] farse, int farseLen, int pointCnt) {

        // 1-1. 지점 개수에 해당하는 2차원 배열 생성
        int[][] routeArr = new int[pointCnt][pointCnt];

        // 1-2. 지점 간 이동 비용 입력
        for (int i = 0; i < farseLen; i++) {
            routeArr[farse[i][0] - 1][farse[i][1] - 1] = routeArr[farse[i][1] - 1][farse[i][0] - 1] = farse[i][2];
        }

        // 1-3. 이동 방안이 없는 경우 최대 비용 입력
        for (int j = 0; j < pointCnt; j++) {
            for (int k = 0; k < pointCnt; k++) {
                if (j != k && routeArr[j][k] == 0) {
                    routeArr[j][k] = 20000000;
                }
            }
        }

        return routeArr;
    }

    private int nextIdx(int[][] routeArr, int point, int runCnt, boolean[] isCheck) {
        int minVal = 20000000;
        int minIdx = runCnt - 1;

        for (int i = 0; i < runCnt; i++) {
            if (!isCheck[i] && minVal > routeArr[point][i]) {
                minVal = routeArr[point][i];
                minIdx = i;
            }
        }

        isCheck[minIdx] = true;

        return minIdx;
    }

}