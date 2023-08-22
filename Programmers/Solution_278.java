// 문제 : 문자열 잘라서 정렬하기

import java.util.Arrays;

class Solution_278 {

    public String[] solution(String param) {

        // "x"를 구분자로 문자열 배열 생성 후, 빈 문자열을 제거하여 결과 반환
        return Arrays.stream(param.split("x")).filter(item -> item.length() > 0).sorted().toArray(String[]::new);

    }

}