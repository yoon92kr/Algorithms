// 문제 : 배열 만들기 2

import java.util.ArrayList;

class Solution_319 {

    public int[] solution(int l, int r) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        int val;
        /*
         * r의 최대값이 1,000,000이므로 최대 값은 555,555 이다.
         * 따라서 2진수로 게산 시 63(111111) * 5 가 최대이므로 해당 수 만큼 반복한다.
         */
        for (int i = 1; i < 64; i++) {
            val = Integer.valueOf(Integer.toBinaryString(i)) * 5;
            if (val >= l && val <= r) {
                list.add(val);
            }
        }

        // List를 배열로 변환 후 반환
        return list.size() == 0 ? new int[] { -1 } : list.stream().mapToInt(Integer::intValue).toArray();
    }

}
