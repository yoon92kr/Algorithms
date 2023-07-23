// 문제 : n 번째 원소부터

class Solution_240 {

    public int[] solution(int start, int end) {
        int len = start - end + 1;
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            result[i] = start - i;
        }

        return result;
    }

}
