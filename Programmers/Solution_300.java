// 문제 : 배열의 길이를 2의 거듭제곱으로 만들기

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution_300 {

    public int[] solution(int[] arr) {

        int len = arr.length;
        int val, rem = 0;

        if (len > 3) {
            while (len != 1) {
                if (len % 2 == 0) {
                    val++;
                    len /= 2;
                } else {
                    rem++;
                    len -= 1;
                }
            }
        }

        if (rem == 1) { // 2의 제곱근일 경우 조정이 필요 없기 때문에 파라미터를 그대로 반환한다.
            return arr;
        } else {

        }

        System.out.println(a);
        System.out.println(b);

        int[] result = {};

        List<Integer> al = Arrays.stream(arr).boxed().collect(Collectors.toList());

        return result;

    }

}