// 문제 : n^2 배열 자르기

class Solution_329 {

    public int[] solution(int n, long left, long right) {
        int index = 0;
        int[] result = new int[(int) (right - left) + 1];

        for (long i = left; i <= right; i++) {
            result[index] = Math.max((int) (i / n) + 1, (int) (i % n) + 1);
            index++;
        }

        return result;
    }

}