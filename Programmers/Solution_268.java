// 문제 : 배열의 원소 삭제하기

import java.util.Arrays;

class Solution_268 {

    public int[] solution(int[] param) {

        int[] result = new int[5];
        Arrays.sort(param);

        for (int i = 0; i < 5; i++) {
            result[i] = param[i];
        }

        return result;

    }

}