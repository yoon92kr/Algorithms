// 문제 : 접미사 배열

import java.util.Arrays;

class Solution_279 {

    public String[] solution(String param) {
        int strLen = param.length();
        String[] result = new String[strLen];

        for (int i = 0; i < strLen; i++) {
            result[i] = param.substring(i, strLen);
        }

        Arrays.sort(result);

        return result;

    }

}