// 문제 : 2의 영역

import java.util.Arrays;

class Solution_303 {

    public int[] solution(int[] arr) {

        // int 배열을 문자열로 변환
        String strVal = Arrays.toString(arr);

        int idxA = strVal.indexOf("2");
        int idxZ = strVal.lastIndexOf("2");

        if (idxA == -1 && idxZ == -1) { // 배열에 2가 없을 경우
            return new int[] { -1 };
        } else if (idxA == idxZ) { // 배열의 2의 시작 index와 끝 index가 같을 경우
            return new int[] { 2 };
        } else {
            // 최초의 2와, 마지막 2의 index를 구해 문자열을 추출하고 문자열 배열로 변환
            String[] strArr = strVal.substring(idxA, idxZ + 1).replace(" ", "").split(",");

            // int 배열로 변환
            return Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray();
        }

    }

}