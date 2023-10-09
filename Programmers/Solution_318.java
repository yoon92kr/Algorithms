// 문제 : 전국 대회 선발 고사

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution_318 {

    public int solution(int[] rank, boolean[] attendance) {

        int runCnt = rank.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        // 참여 가능한 인원을 추출
        for (int i = 0; i < runCnt; i++) {
            if (attendance[i]) {
                map.put(rank[i], i);
            }
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());
        // 키 값(성적순)으로 오름차순 정렬
        Collections.sort(keySet);

        return map.get(keySet.get(0)) * 10000 + map.get(keySet.get(1)) * 100 + map.get(keySet.get(2));
    }

}
