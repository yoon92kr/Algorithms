// 문제 : 배열 비교하기

import java.util.Arrays;

class Solution_248 {

    public int solution(int[] arr1, int[] arr2) {

        int len1 = arr1.length;
        int len2 = arr2.length;
        // 길이를 비교한다
        if (len1 != len2) {
            return len1 > len2 ? 1 : -1;
        }

        int sum1 = Arrays.stream(arr1).sum();
        int sum2 = Arrays.stream(arr2).sum();
        // 합계를 비교한다
        if (sum1 != sum2) {
            return sum1 > sum2 ? 1 : -1;
        }

        return 0;

    }

}