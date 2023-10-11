// 문제 : 배열 조각하기

import java.util.Arrays;

class Solution_321 {

    public int[] solution(int[] arr, int[] query) {

        int startIdx = 0;
        int endIdx = arr.length;
        int runCnt = query.length;

        for (int i = 0; i < runCnt; i++) {
            if (i % 2 == 0) {
                endIdx -= endIdx - query[i] - 1;
            } else {
                startIdx += query[i];
            }
        }

        return Arrays.copyOfRange(arr, startIdx, endIdx + 1);
    }
}