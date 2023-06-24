// 문제 : 이중우선순위큐

import java.util.ArrayList;
import java.util.Collections;

class Solution_222 {

    ArrayList<Integer> list = new ArrayList<Integer>();
    final String INSERT = "I";
    private int lastIdx = -1;

    public int[] solution(String[] operations) {
        int runCnt = operations.length;
        String[] value;
        int[] result = { 0, 0 };

        for (int i = 0; i < runCnt; i++) {
            value = operations[i].split(" ");
            if (value[0].equals(INSERT)) {
                insert(Integer.valueOf(value[1]));
            } else {
                delete(Integer.valueOf(value[1]));
            }
        }

        if (!list.isEmpty()) {
            Collections.sort(list); // 최종 값을 확인하기 위한 정렬
            result[0] = list.get(lastIdx);
            result[1] = list.get(0);
        }

        return result;
    }

    private void delete(int flag) {
        if (!list.isEmpty()) {
            Collections.sort(list); // 정렬 후 flag에 따라 최소 혹은 최댓값을 삭제
            list.remove(flag == -1 ? 0 : lastIdx);
            lastIdx--;
        }
    }

    private void insert(int param) {
        list.add(param);
        lastIdx++;
    }

}
