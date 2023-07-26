// 문제 : n 번째 원소부터

class Solution_243 {

    public int[] solution(int[] numList, int n) {

        int idx = 0;
        int len = numList.length;
        int startIdx = n - 1;
        int[] result = new int[len - n + 1];

        for (int i = startIdx; i < len; i++) {
            result[idx] = numList[i];
            idx++;
        }

        return result;

    }

}