// 문제 : 튜플

import java.util.Arrays;

class Solution_332 {

    public int[] solution(String strTuple) {

        String test1 = strTuple.replaceAll("\\},\\{", "|");
        String test2 = test1.replaceAll("[\\{\\}]", "");
        String[] strArr = test2.split("\\|"); // 배열 형태로 치환
        Arrays.sort(strArr, (String str1, String str2) -> str1.length() - str2.length());// 길이순 정렬

        int[] result = new int[strArr.length]; // 최대 길이의 배열 크기만큼의 정수 배열 생성
        result[0] = Integer.valueOf(strArr[0]);

        for (int i = 1; i < strArr.length; i++) {
            String[] val = strArr[i].split(",");

            if (Integer.valueOf(val[i - 1]) != result[i - 1]) {
                result[i] = Integer.valueOf(val[i - 1]);
            } else {
                result[i] = Integer.valueOf(val[i]);
            }
        }

        return result;

    }

    public static void main(String[] args) {
        Solution_332 test = new Solution_332();

        test.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}");
    }

}
