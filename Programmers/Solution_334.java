// 문제 : 피로도

class Solution_334 {

    int expOnce = 0;

    public int solution(int power, int[][] dungeons) {

        explore(power, dungeons.length, dungeons, new boolean[dungeons.length], 0);

        return expOnce;

    }

    private void explore(int power, int dungeonsCnt, int[][] dungeons, boolean[] isVisit, int clearCnt) {

        /* 탐험한 던전이 1회 최대 탐험 값보다 클 경우 대입 */
        if (clearCnt > expOnce) {
            expOnce = clearCnt;
        }

        /* 이미 모든 던전을 탐험한 루트가 있을경우 종료 */
        if (expOnce != dungeonsCnt) {

            for (int i = 0; i < dungeonsCnt; i++) {
                boolean[] isVisitC = isVisit.clone();

                /* 탐험하지 않은 던전이라면 탐험 시작 */
                if (!isVisitC[i]) {
                    isVisitC[i] = true;

                    /* 남은 체력으로 탐험이 가능하다면 탐험 후 다음 던전 탐색 */
                    if (power >= dungeons[i][0]) {
                        explore(power - dungeons[i][1], dungeonsCnt, dungeons, isVisitC, clearCnt + 1);
                    }
                }

            }

        }

    }

}
