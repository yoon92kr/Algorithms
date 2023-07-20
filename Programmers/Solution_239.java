// 문제 : 카운트 다운

class Solution_239 {

    public int[] solution(int start, int end) {
        int len = start - end + 1;
        int[] result = new int[len];

        for (int i = 0; i < len; i++) {
            result[i] = start - i;
        }

        return result;
    }

}
