// 문제 : 홀짝에 따라 다른 값 반환하기

class Solution_265 {

    public int solution(int param) {

        return param % 2 == 1 ? sumOdd(param) : sumEvenSquares(param);

    }

    private int sumOdd(int param) {
        int result = 0;

        for (int i = 1; i <= param; i += 2) {
            result += i;
        }

        return result;
    }

    private int sumEvenSquares(int param) {
        int result = 0;

        for (int i = 2; i <= param; i += 2) {
            result += Math.pow(i, 2);
        }

        return result;
    }

}