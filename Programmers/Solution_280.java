// 문제 : 9로 나눈 나머지

import java.util.Arrays;

class Solution_280 {

    public int solution(String param) {

        return Arrays.stream(param.split("")).mapToInt(Integer::parseInt).sum() % 9;

    }

}