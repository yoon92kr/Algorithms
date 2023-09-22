// 문제 : 문자열 묶기

import java.util.Arrays;

class Solution_304 {

    public int solution(String[] strArr) {

        int runCnt = strArr.length;
        int[] lenArr = new int[30]; // 문자열 길이를 index로 활용하는 배열 생성

        for (int i = 0; i < runCnt; i++) {
            lenArr[strArr[i].length() - 1]++; // 문자열 길이 index에 해당하는 값을 1 증감
        }

        return Arrays.stream(lenArr).max().getAsInt();

    }

}