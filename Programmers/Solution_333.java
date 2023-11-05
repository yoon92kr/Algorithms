// 문제 : 프로세스

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution_333 {

    public int solution(int[] priorities, int location) {

        List<Integer> queue = Arrays.stream(priorities).boxed().collect(Collectors.toList());
        List<Integer> keyList = getDistKeyArray(priorities, priorities.length);
        int tryCnt = 0;

        while (true) {
            if (queue.get(0) == keyList.get(0)) {
                queue.remove(0);
                tryCnt++;
                if (location == 0) {
                    break;
                }
            } else {
                queue.add(queue.get(0));
                queue.remove(0);
            }

            location--;
            if (location < 0) {
                location += queue.size();
            }

            /* 더이상 queue에 최대값이 없을경우 다음값을 찾는다 */
            if (!queue.contains(keyList.get(0))) {
                keyList.remove(0);
            }
        }

        return tryCnt;
    }

    // queue안의 유일 키를 확인한다.
    private List<Integer> getDistKeyArray(int[] priorities, int len) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < len; i++) {
            if (!list.contains(priorities[i])) {
                list.add(priorities[i]);
            }
        }

        Collections.sort(list, Collections.reverseOrder()); // 내림차순 정렬
        return list;
    }

}
