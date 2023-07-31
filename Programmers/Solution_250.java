// 문제 : 주사위 게임 1

class Solution_250 {

    public int solution(int a, int b) {

        // 두 수가 모두 홀수라면 a² + b² 를 반환한다
        if (a % 2 == 1 && b % 2 == 1) {
            return (int) (Math.pow(a, 2) + Math.pow(b, 2));
        }

        // 두 수가 모두 짝수라면 |a-b| 를 반환한다
        if (a % 2 == 0 && b % 2 == 0) {
            return Math.abs(a - b);
        }

        // 이외 (하나의 수가 홀수인 경우)에는 2X(a+b) 를 반환한다
        return 2 * (a + b);
    }

}