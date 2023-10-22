// 문제 : 연속 부분 수열 합의 개수

import java.util.HashSet;

class Solution_327 {

    public int solution(int[] elements) {

        int sum;
        int runCnt = elements.length;
        HashSet<Integer> set = new HashSet<Integer>(); // 중복 제거를 위한 HashSet 객체 선언

        for (int i = 1; i < runCnt; i++) {

            for (int j = 0; j < runCnt; j++) {
                sum = 0; // 길이만큼의 배열의 합을 집계
                for (int k = j; k < j + i; k++) {
                    sum += elements[k % runCnt];
                }
                set.add(sum); // 도출한 값을 HashSet에 추가
            }

        }

        return set.size() + 1;
    }

}
