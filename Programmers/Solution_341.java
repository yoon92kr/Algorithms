// 문제 : [PCCE 기출문제] 9번 / 이웃한 칸

class Solution_341 {

    static int[] dh = { 0, 1, -1, 0 }, dw = { 1, 0, 0, -1 };
    int maxIdx;

    public int solution(String[][] board, int h, int w) {

        int blockCnt = 0;
        maxIdx = board.length - 1;

        for (int i = 0; i < 4; i++) {
            if (isInIdx(dh[i] + h) && isInIdx(dw[i] + w)) {
                if (board[h][w].equals(board[dh[i] + h][dw[i] + w])) {
                    blockCnt++;
                }
            }
        }

        return blockCnt;

    }

    private boolean isInIdx(int param) {
        return param >= 0 && param < maxIdx ? true : false;
    }

}