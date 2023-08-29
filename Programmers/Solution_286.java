// 문제 : 배열 만들기 5

import java.util.Arrays;

class Solution_286 {

    public int[] solution(String[] intStrs, int k, int s, int l) {

        return Arrays.stream(intStrs)
                .map(i -> i.substring(s, s + l)) // 배열의 각 원소를 s index 부터 l 길이만큼 추출
                .filter(i -> Integer.valueOf(i) > k) // 변형한 원소가 k보다 큰 원소만 추출
                .mapToInt(Integer::parseInt).toArray(); // int 배열로 변환

    }

}