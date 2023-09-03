// 문제 : 빈 배열에 추가, 삭제하기

import java.util.Arrays;

class Solution_290 {

    public int[] solution(int[] arr, boolean[] flag) {

        StringBuilder sb = new StringBuilder();
        int runCnt = arr.length;

        for (int i = 0; i < runCnt; i++) {
            if (flag[i]) { // flag가 true라면, 해당 index의 원소를 원소의 두배만큼 결과에 붙인다.
                sb.append(String.valueOf(arr[i]).repeat(arr[i] * 2));
            } else { // flag가 false라면, 원소의 값 크기만큼 문자열을 뒤에서 부터 제거한다.
                sb.delete(sb.length() - arr[i], sb.length());
            }
        }

        return Arrays.stream(sb.toString().split("")).mapToInt(Integer::parseInt).toArray();
    }

}