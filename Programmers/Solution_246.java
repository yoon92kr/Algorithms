// 문제 : n개 간격의 원소들

class Solution_246 {

    public int[] solution(int[] numList, int interval) {

        int idx = 0;
        int len = numList.length;
        int[] result = new int[1 + (len - 1) / interval];

        for (int i = 0; i < len; i += interval) {
            result[idx] = numList[i];
            idx++;
        }

        return result;

    }

}