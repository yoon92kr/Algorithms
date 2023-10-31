// 문제 : 금과 은 운반하기

class Solution_331 {

    public long solution(int goldReq, int silverReq, int[] gold, int[] silver, int[] weightCarry, int[] timeReq) {

        long maxTime = (goldReq * 200000L) + (silverReq * 200000L); // 최대 소요시간 산출
        long middleTime = 0L;
        int cityCnt = gold.length;

        /* 이진 탐색을 통해 건설에 필요한 최소 소요시간 산출 */
        while (middleTime + 1 < maxTime) {
            long runTime = (maxTime + middleTime) / 2L;
            long goldCarry = 0L, silverCarry = 0L, totalCarry = 0L;

            for (int i = 0; i < cityCnt; i++) {
                long carryCnt = (runTime / (2L * timeReq[i])) + (runTime % (2L * timeReq[i])) / timeReq[i];
                long carryOnce = Math.min(carryCnt * weightCarry[i], gold[i] + silver[i]);

                totalCarry += carryOnce;
                goldCarry += Math.min(carryOnce, gold[i]);
                silverCarry += Math.min(carryOnce, silver[i]);
            }

            if (totalCarry >= goldReq + silverReq && goldCarry >= goldReq && silverCarry >= silverReq) {
                maxTime = runTime;
            } else {
                middleTime = runTime;
            }
        }

        return maxTime;
    }

}