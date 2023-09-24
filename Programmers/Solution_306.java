// 문제 : qr code

class Solution_306 {

    public String solution(int q, int r, String code) {

        int runCnt = code.length();
        String result = "";

        for (int i = 0; i < runCnt; i++) {
            if (i % q == r) {
                result += code.charAt(i);
            }
        }

        return result;

    }

}