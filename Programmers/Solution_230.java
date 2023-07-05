// 문제 : 마지막 두 원소

import java.util.Arrays;

class Solution_230 {

    public int[] solution(int[] num_list) {

        int len = num_list.length;
        int[] result = Arrays.copyOf(num_list, len + 1);
        result[len] = num_list[len - 1] > num_list[len - 2] ? num_list[len - 1] - num_list[len - 2]
                : num_list[len - 1] * 2;

        return result;

    }

}
