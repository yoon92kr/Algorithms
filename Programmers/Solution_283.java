// 문제 : 문자열 섞기

class Solution_283 {

    public String solution(String str1, String str2) {

        int runCnt = str1.length();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < runCnt; i++) {
            result.append(str1.charAt(i));
            result.append(str2.charAt(i));
        }

        return result.toString();

    }

}