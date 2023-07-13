// 문제 : 둘만의 암호

import java.util.Arrays;

class Solution_236 {

    static char[] skipArr;
    static int skipLen;
    static int idx;

    public String solution(String param, String skip, int index) {

        String result = "";
        int runCnt = param.length();
        makeStatic(skip, skip.length(), index);

        for (int i = 0; i < runCnt; i++) {
            result += addIndex(param.charAt(i));
        }

        return result;

    }

    private void makeStatic(String skip, int len, int index) {
        idx = index;
        skipLen = len;
        skipArr = new char[skipLen];

        for (int i = 0; i < len; i++) {
            skipArr[i] = skip.charAt(i);
        }

        Arrays.sort(skipArr);
    }

    private char addIndex(char param) {
        char addedParam = (char) (param + idx);

        for (int i = 0; i < skipLen; i++) {
            if (param <= skipArr[i] && skipArr[i] <= addedParam) {
                addedParam++;
            }
        }

        return addedParam > 122 ? (char) (addedParam - 26) : addedParam;
    }

    public static void main(String[] args) {
        Solution_236 test = new Solution_236();

        System.out.println(test.solution("zzz", "a", 1));
    }
}