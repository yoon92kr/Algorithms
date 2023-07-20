// 문제 : 배열의 원소만큼 추가하기

import java.util.Arrays;

class Solution_238 {

    public int[] solution(int[] arr) {
        int[] result = new int[Arrays.stream(arr).sum()];
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }

}
