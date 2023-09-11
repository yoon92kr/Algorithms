// 문제 : 세 개의 구분자

import java.util.Arrays;

class Solution_298 {

    public String[] solution(String myStr) {

        String[] splitABC = myStr.split("[abc]");
        String[] resultArr = Arrays.stream(splitABC).filter(str -> str.length() > 0).toArray(String[]::new);

        return resultArr.length > 0 ? resultArr : new String[] { "EMPTY" };

    }
}