// 문제 : 배열 만들기 4

import java.util.ArrayList;

class Solution_309 {

    public int[] solution(int[] arr) {

        ArrayList<Integer> stk = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            // stk 마지막 원소가 arr[i]보다 크거나 같을 경우, skt의 마지막 원소를 제거
            if (stk.size() != 0 && stk.get(stk.size() - 1) >= arr[i]) {
                stk.remove(stk.size() - 1);
                i--;
            } else { // 이외의 경우(stk가 비어있거나, stk의 마지막 원소가 arr[i]보다 작을 경우) arr[i]를 stk에 더하고, 다음 원소를 확인
                stk.add(arr[i]);
            }
        }

        // Integer ArrayList를 int 배열로 변환 후 반환
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }

}