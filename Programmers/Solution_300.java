// 문제 : 배열의 길이를 2의 거듭제곱으로 만들기

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution_300 {

    public int[] solution(int[] arr) {

        int len = arr.length;
        int val = 0;
        int rem = 0;
        int[] result = {};

        while (len != 1) {
            if (len % 2 == 0) {
                val++;
                len /= 2;
            } else {
                rem++;
                len -= 1;
            }
        }

        if (rem == 0) { // 2의 제곱근일 경우 조정이 필요 없기 때문에 파라미터를 그대로 반환한다.
            return arr;
        } else {
            List<Integer> al = Arrays.stream(arr).boxed().collect(Collectors.toList());
            len = (int) Math.pow(2, val + 1);

            // 다음 2의 제곱근의 값까지 0을 추가한다.
            for (int i = arr.length; i < len; i++) {
                al.add(0);
            }

            result = al.stream().mapToInt(Integer::intValue).toArray(); // 배열로 변환
        }

        return result;

    }

}