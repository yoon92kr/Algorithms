// 문제 : 부분 문자열 이어 붙여 문자열 만들기

class Solution_263 {

    public String solution(String[] my_strings, int[][] parts) {

        String result = "";
        int runCnt = my_strings.length;

        for (int i = 0; i < runCnt; i++) {
            result += my_strings[i].substring(parts[i][0], parts[i][1] + 1);
        }

        return result;

    }

}