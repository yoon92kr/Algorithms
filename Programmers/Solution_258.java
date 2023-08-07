// 문제 : 뒤에서 5등 위로

import java.util.Arrays;

class Solution_258 {

    public int[] solution(int[] num_list) {

        Arrays.sort(num_list); // 배열 오름차순 정렬

        return Arrays.copyOfRange(num_list, 5, num_list.length);

    }

}