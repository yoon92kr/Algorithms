// 문제 : 부분 문자열인지 확인하기

class Solution_231 {

    public int solution(String my_string, String target) {

        return my_string.indexOf(target) > 0 ? 1 : 0;

    }

}
