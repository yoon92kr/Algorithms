// 문제 : 문자 개수 세기

class Solution_308 {

    public int[] solution(String my_string) {

        int[] result = new int[52];
        int runCnt = my_string.length();

        for (int i = 0; i < runCnt; i++) {
            // 알파벳에 해당하는 index를 1 증가
            result[getIndex(my_string.charAt(i))]++;
        }

        return result;

    }

    /* 대소문자에 따라, 배열 내 index를 조회 */
    private int getIndex(char param) {
        return param > 96 ? param - 71 : param - 65;
    }

}