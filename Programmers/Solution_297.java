// 문제 : 1로 만들기

class Solution_297 {

    public int solution(int[] num_list) {

        int result = 0;

        for (int i = 0; i < num_list.length; i++) {
            result += makeOne(num_list[i]);
        }

        return result;

    }

    private int makeOne(int param) {
        int runCnt = 0;

        while (param != 1) {
            param = param % 2 == 0 ? param / 2 : (param - 1) / 2;
            runCnt++;
        }

        return runCnt;
    }
}