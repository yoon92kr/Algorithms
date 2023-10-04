// 문제 : 배열 만들기 6

import java.util.ArrayList;

class Solution_312 {

    public int[] solution(int[] arr) {

        ArrayList<Integer> stk = new ArrayList<Integer>();
        int runCnt = arr.length;

        for (int i = 0; i < runCnt; i++) {
            // stk 마지막 원소가 arr[i]와 같을 경우, skt의 마지막 원소를 제거
            if (stk.size() != 0 && stk.get(stk.size() - 1) == arr[i]) {
                stk.remove(stk.size() - 1);
            } else { // 이외의 경우(stk가 비어있거나, stk의 마지막 원소가 arr[i]와 다를 경우) arr[i]를 stk에 추가
                stk.add(arr[i]);
            }
        }

        // skt가 비어있을 경우 -1이 입력된 배열을 반환하고, 값이 존재할 경우 Integer ArrayList를 int 배열로 변환 후 반환
        return stk.size() == 0 ? new int[] { -1 } : stk.stream().mapToInt(Integer::intValue).toArray();
    }

}
