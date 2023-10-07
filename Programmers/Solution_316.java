// 문제 : 무작위로 K개의 수 뽑기

import java.util.Arrays;

class Solution_316 {

    public int[] solution(int[] arr, int k) {

        int[] result = new int[k];
        int[] distinctArr = Arrays.stream(arr).distinct().toArray();

        for (int i = 0; i < k; i++) {
            // 중복을 제거한 랜덤배열의 길이가 i보다 클 경우 해당 값을 입력하고, 아닐경우 -1을 입력한다
            result[i] = distinctArr.length > i ? distinctArr[i] : -1;
        }

        return result;

    }

}
