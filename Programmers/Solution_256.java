// 문제 : 배열의 길이에 따라 다른 연산하기

import java.util.stream.IntStream;

class Solution_256 {

    public int[] solution(int[] arr, int n) {

        int arrLen = arr.length;
        int flag = arrLen % 2 == 1 ? 0 : 1;

        return IntStream.range(0, arrLen).map(i -> i % 2 == flag ? arr[i] + n : arr[i]).toArray();

    }

}