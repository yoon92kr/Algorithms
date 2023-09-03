// 문제 : 수열과 구간 쿼리 3

class Solution_291 {

    public int[] solution(int[] arr, int[][] queries) {

        int runCnt = queries.length;
        int tmpVal;

        for (int i = 0; i < runCnt; i++) {
            tmpVal = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = tmpVal;
        }

        return arr;
    }

}