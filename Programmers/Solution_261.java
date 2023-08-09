// 문제 : 더 크게 합치기

class Solution_261 {

    public int solution(int a, int b) {

        return Math.max(a * intLength(b) + b, b * intLength(a) + a);

    }

    // 비교 대상의 자릿수(x) 만큼의 Log10x를 구한다
    private int intLength(int param) {

        return (int) Math.pow(10, (int) (Math.log10(param) + 1));

    }

}