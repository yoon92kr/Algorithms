// 문제 : x 사이의 개수

import java.util.Arrays;

class Solution_273 {

    public int[] solution(String param) {

        // "x"를 기준으로 문자열을 구분하고, 길이릘 판단 후 int Array로 변환
        return Arrays.stream(param.split("x", -1)).map(String::length).mapToInt(Integer::intValue).toArray();

    }

}