// 문제 : 문자열 정수의 합

class Solution_242 {

    public int solution(String numStr) {
        String[] strArray = numStr.split("");
        int len = strArray.length;
        int result = 0;

        for (int i = 0; i < len; i++) {
            result += Integer.parseInt(strArray[i]);
        }

        return result;
    }

}
