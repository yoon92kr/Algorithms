// 문제 : 순서 바꾸기

class Solution_270 {

    public int[] solution(int[] param, int n) {

        int idx = 0;
        int runCnt = param.length;
        int[] result = new int[runCnt];

        // n번째 이후의 원소 입력
        for (int i = n; i < runCnt; i++) {
            result[idx] = param[i];
            idx++;
        }

        // n번째 이전 원소 입력
        for (int i = 0; i < n; i++) {
            result[idx] = param[i];
            idx++;
        }

        return result;
    }

}