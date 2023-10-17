// 문제 : 정수를 나선형으로 배치하기

class Solution_323 {

    int[] xFlag = { 1, 0, -1, 0 }; // 회전에 따른 행의 증가 값
    int[] yFlag = { 0, 1, 0, -1 };// 회전에 따른 열의 증가 값

    public int[][] solution(int n) {

        int maxNum = (int) Math.pow(n, 2); // 최대값 (n²)
        int num = 0, flag = 0, x = 0, y = 0; // num, 증가값 스위칭 flag, x축 index, y축 index
        int tmpX, tmpY; // x, y축 임시 index
        int[][] result = new int[n][n];

        while (num != maxNum) {
            /* 1. 해당 좌표에 num을 추가한다 */
            result[y][x] = ++num;

            /* 2. 다음 좌표를 산정한다 */
            tmpX = x + xFlag[flag % 4];
            tmpY = y + yFlag[flag % 4];

            /* 3. 산정된 좌표에 입력할 수 없는 경우 flag를 증가시킨다 */
            if (tmpY == n || tmpX == n) { // 좌표가 최대 index에 도달
                flag++;
            } else if (tmpY == -1 || tmpX == -1) { // 좌표가 최소 index에 도달
                flag++;
            } else if (result[tmpY][tmpX] != 0) { // 좌표에 값이 존재
                flag++;
            }

            /* 4. 다음 좌표를 지정한다 */
            y += yFlag[flag % 4];
            x += xFlag[flag % 4];
        }

        return result;

    }

}