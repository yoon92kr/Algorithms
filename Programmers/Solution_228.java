// 문제 : 문자열 나누기

class Solution_228 {

    public int solution(String param) {

        int runCnt = param.length();
        char target = param.charAt(0);
        int splitLen = 0, targetCnt = 0, elseCnt = 0;

        for (int i = 0; i < runCnt; i++) {

            if (targetCnt + elseCnt == 0) {
                target = param.charAt(i);
            }

            if (target != param.charAt(i)) {
                elseCnt++;
            } else {
                targetCnt++;
            }

            if (targetCnt == elseCnt) {
                targetCnt = 0;
                elseCnt = 0;
                splitLen++;
            }
        }

        return splitLen += targetCnt + elseCnt > 0 ? 1 : 0;

    }

}
