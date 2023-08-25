// 문제 : 배열 만들기 3

class Solution_281 {

    public int[] solution(int[] arr, int[][] intervals) {

        int idx = 0;
        int[] result = new int[getIntervlaLen(intervals[0]) + getIntervlaLen(intervals[1])];

        for (int i = 0; i < 2; i++) {
            for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                result[idx] = arr[j];
                idx++;
            }
        }

        return result;

    }

    // 닫힌 구간의 크기를 반환
    private int getIntervlaLen(int[] param) {

        return param[1] - param[0] + 1;

    }

}