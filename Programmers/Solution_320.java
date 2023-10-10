// 문제 : 코드 처리하기

class Solution_320 {

    public String solution(String code) {

        int mode = 0;
        StringBuilder ret = new StringBuilder();
        int runCnt = code.length();

        for (int i = 0; i < runCnt; i++) {
            if (code.charAt(i) == '1') {
                /* code가 1일경우 0 → 1, 1 → 0으로 변경한다. */
                mode ^= 1;
            } else {
                /* i를 2로 나눈 나머지가 mode일 경우 ret에 추가한다. */
                ret.append(i % 2 == mode ? code.charAt(i) : "");
            }
        }

        return ret.length() == 0 ? "EMPTY" : ret.toString();
    }

}
