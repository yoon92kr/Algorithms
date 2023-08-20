// 문제 : 특별한 이차원 배열 1

class Solution_275 {

    public int[][] solution(int param) {
        int[][] result = new int[param][param];

        for (int i = 0; i < param; i++) {
            result[i][i] = 1;
        }

        return result;
    }

}