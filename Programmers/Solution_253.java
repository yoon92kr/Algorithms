// 문제 : 글자 이어 붙여 문자열 만들기

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution_253 {

    public String solution(String param, int[] indexList) {

        return Arrays.stream(indexList).mapToObj(i -> String.valueOf(param.charAt(i))).collect(Collectors.joining());

    }

}