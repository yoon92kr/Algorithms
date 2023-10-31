// 문제 : 금과 은 운반하기

class Solution_331 {

    public long solution(int goldReq, int silverReq, int[] gold, int[] silver, int[] weightCarry, int[] timeReq) {

        long addTime = 0L, maxTime = (goldReq * 200000L) + (silverReq * 200000L);
        int cityCnt = gold.length;

        while (addTime + 1 < maxTime) {
            long runTime = (maxTime + addTime) / 2L;
            long goldCarry = 0L, silverCarry = 0L, totalCarry = 0L;

            for (int i = 0; i < cityCnt; i++) {
                long cnt = runTime / (2L * timeReq[i]);
                if (runTime % (2L * timeReq[i]) >= timeReq[i])
                    cnt++;

                long carry = Math.min(cnt * weightCarry[i], gold[i] + silver[i]);
                totalCarry += carry;
                goldCarry += Math.min(carry, gold[i]);
                silverCarry += Math.min(carry, silver[i]);
            }

            if (totalCarry > goldReq + silverReq && goldCarry >= goldReq && silverCarry >= silverReq)
                maxTime = runTime;
            else
                addTime = runTime;
        }

        return maxTime;
    }

}