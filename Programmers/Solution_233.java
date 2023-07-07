// 문제 : 조건에 맞게 수열 변환하기 3

import java.util.stream.IntStream;

class Solution_233 {

    public int[] solution(int[] arr, int k) {
        return k % 2 == 1 ? IntStream.of(arr).map(i -> i * k).toArray() : IntStream.of(arr).map(i -> i + k).toArray();
    }

}
