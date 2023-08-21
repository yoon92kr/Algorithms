// 문제 : ad 제거하기

import java.util.Arrays;

class Solution_277 {

    public String[] solution(String[] strArr) {

        // 배열 내 "ad"가 포함되지 않은 요소만 추출하여 반환
        return Arrays.stream(strArr).filter(item -> !item.contains("ad")).toArray(String[]::new);

    }

}