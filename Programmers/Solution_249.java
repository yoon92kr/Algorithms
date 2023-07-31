// 문제 : 접두사인지 확인하기

class Solution_249 {

    public int solution(String my_string, String is_prefix) {

        if (is_prefix.length() > my_string.length()) {
            return 0;
        }

        return my_string.substring(0, is_prefix.length()).equals(is_prefix) ? 1 : 0;

    }

}