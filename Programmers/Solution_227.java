// 문제 : 덧칠하기

class Solution_227 {

    public int solution(int width, int paint, int[] section) {

        int point = 0;
        int result = 0;

        for (int i = 0; i < section.length; i++) {
            if (point < section[i]) {
                point = section[i] + paint - 1;
                result++;
            }
        }

        return result;

    }

}
