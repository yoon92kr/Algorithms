// 문제 : 조건에 맞게 수열 변환하기 2

import java.util.Arrays;

class Solution_305 {

    public int solution(int[] arr) {

        int runCnt = arr.length;
        int[] tmpArr = new int[runCnt];

        int answer = 0;

        while (!Arrays.equals(arr, tmpArr)) {
            tmpArr = arr.clone(); // 기존배열 복제
            answer++;
            for (int i = 0; i < runCnt; i++) {
                arr[i] = getResult(arr[i]);
            }
        }

        return --answer;

    }

    private int getResult(int param) {
        if (param >= 50 && param % 2 == 0) {
            return param / 2;
        } else if (param < 50 && param % 2 == 1) {
            return param * 2 + 1;
        }

        return param;
    }

}