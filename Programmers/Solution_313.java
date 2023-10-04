// 문제 : 문자열 여러 번 뒤집기

class Solution_313 {

    public String solution(String my_string, int[][] queries) {

        int startIdx, endIdx;
        int runCnt = queries.length;
        StringBuilder sb = new StringBuilder(my_string);

        for (int i = 0; i < runCnt; i++) {
            startIdx = queries[i][0];
            endIdx = ++queries[i][1];

            sb.replace(startIdx, endIdx, new StringBuilder(sb.substring(startIdx, endIdx)).reverse().toString());
        }

        return sb.toString();
    }

}
