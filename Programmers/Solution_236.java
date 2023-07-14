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
            if (Math.min(param, addedParam) <= skipArr[i] && skipArr[i] <= Math.max(param, addedParam)) {
                addedParam++;
            }
        }

        return addedParam > 122 ? (char) (addedParam - 26) : addedParam;
    }

}

/*
 * 참고할만한 풀이
 * 
 * class Solution {
 * public String solution(String s, String skip, int index) {
 * String answer = "";
 * String alphabet = "abcdefghijklmnopqrstuvwxyz";
 * int idx;
 * for(int i =0; i<skip.length();i++) {
 * alphabet = alphabet.replace(Character.toString(skip.charAt(i)), "");
 * }
 * for(int i =0; i<s.length();i++) {
 * idx=alphabet.indexOf(Character.toString(s.charAt(i)))+index;
 * answer+= Character.toString(alphabet.charAt(idx%alphabet.length()));
 * }
 * 
 * return answer;
 * 
 * }
 * }
 */