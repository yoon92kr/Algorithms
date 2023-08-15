// 문제 : 특별한 이차원 배열 2

class Solution_269 {

    public int solution(int[][] arr) {

        int runCnt = arr.length;

        for (int i = 0; i < runCnt; i++) {
            for (int j = 0; j < runCnt; j++) {
                if (arr[i][j] != arr[j][i])
                    return 0;
            }
        }

        return 1;

    }

}