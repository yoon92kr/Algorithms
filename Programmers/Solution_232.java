// 문제 : 조건에 맞게 수열 변환하기 1

class Solution_232 {

    public int[] solution(int[] arr) {

        int runCnt = arr.length;

        for (int i = 0; i < runCnt; i++) {
            arr[i] = roleCheck(arr[i]);
        }

        return arr;
    }

    private int roleCheck(int param) {

        if (param >= 50 && param % 2 == 0) {
            return param / 2;
        } else if (param < 50 && param % 2 == 1) {
            return param * 2;
        }

        return param;
    }

}
