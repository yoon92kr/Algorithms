// 문제 : 세 개의 구분자

import java.util.Arrays;

class Solution_297 {

    public String[] solution(String myStr) {

        String[] splitABC = String.join("", String.join("", myStr.split("a")).split("b")).split("c");
        String[] resultArr = Arrays.stream(splitABC).filter(i -> i.length() > 0).toArray(String[]::new);

        return resultArr.length > 0 ? resultArr : new String[] { "EMPTY" };

    }
}