// 문제 : 연속 부분 수열 합의 개수

import java.util.HashSet;

class Solution_327 {

    public int solution(int[] elements) {

        int runCnt = elements.length;
        HashSet<Integer> set = new HashSet<Integer>(); // 중복 제거를 위한 HashSet 객체 선언

        for (int i = 1; i < runCnt; i++) {
            int idx = 1;

            /* 길이만큼 배열을 더한다 */
            for (int j = 0; j < runCnt; j++) {
                set.add(elements[j % runCnt]);
            }

        }

        return set.size() + 1;
    }

}