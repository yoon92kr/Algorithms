// 문제 : 등차수열의 특정한 항만 더하기

class Solution_284 {

    public int solution(int a, int d, boolean[] included) {

        int value = a;
        int result = 0;
        int runCnt = included.length;

        for (int i = 0; i < runCnt; i++) {

            if (included[i]) {
                result += value;
            }

            value += d;
        }

        return result;

    }

}