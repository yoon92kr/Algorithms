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

        int result = location;

        while (true) {
            if (queue.get(0) == keyList.get(0)) {

            }
        }

        return result;
    }

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
