// 문제 : n보다 커질 때까지 더하기

class Solution_235 {

    public int solution(int[] numbers, int maximum) {
        int result = 0;
        int runCnt = numbers.length;

        for (int i = 0; i < runCnt; i++) {
            result += numbers[i];
            if (result > maximum)
                break;
        }

        return result;
    }
}