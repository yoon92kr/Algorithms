// 문제 : 귤 고르기

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

class Solution_326 {

    public int solution(int k, int[] tangerine) {

        int result = 0;
        int runCnt = tangerine.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        /* 귤 크기 별 개수를 집계 */
        for (int i = 0; i < runCnt; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }

        /* 개수를 추출하여 List로 만들고, 개수 순으로 정렬 */
        ArrayList<Integer> valList = new ArrayList<Integer>(map.values());
        valList.sort(Comparator.reverseOrder());
        runCnt = valList.size();

        int sum = 0; // 하나의 상자에 담긴 개수 집계

        for (int j = 0; j < runCnt; j++) {
            result++;
            sum += valList.get(j);

            if (sum >= k) { // 하나의 크기로 상자를 채울 수 있다면 종료
                break;
            }
        }

        return result;
    }

}