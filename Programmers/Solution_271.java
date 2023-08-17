// 문제 : 홀수 vs 짝수

class Solution_271 {

    public int solution(int[] param) {

        int runCnt = param.length;
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < runCnt; i++) {
            if (i % 2 == 1) {
                sumOdd += param[i];
            } else {
                sumEven += param[i];
            }
        }

        return Math.max(sumOdd, sumEven);
    }

}