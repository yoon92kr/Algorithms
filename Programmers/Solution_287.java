// 문제 : 세로 읽기

class Solution_287 {

    public String solution(String my_string, int m, int c) {

        String result = "";

        for (int i = 0; i < my_string.length(); i += m) {
            result += my_string.charAt(i + c - 1);
        }

        return result;

    }

}