// 문제 : 수열과 구간 쿼리 4

class Solution_301 {

    public int[] solution(int[] arr, int[][] queries) {

        int runCnt = queries.length;

        for (int i = 0; i < runCnt; i++) {

            int startIdx = queries[i][0];
            int endIdx = queries[i][1];
            int key = queries[i][2];

            for (int s = startIdx; s <= endIdx; s++) {
                if (s % key == 0) {
                    arr[s]++;
                }
            }
        }

        return arr;

    }

}