// 문제 : 정사각형으로 만들기

class Solution_315 {

    public int[][] solution(int[][] arr) {

        int width = arr[0].length;
        int height = arr.length;

        // 정사각형일 경우 arr를 반환한다
        if (width == height) {
            return arr;
        }

        int[][] result = new int[Math.max(width, height)][Math.max(width, height)];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result[i][j] = arr[i][j];
            }
        }

        return result;

    }

}
