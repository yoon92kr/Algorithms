// 문제 : 원하는 문자열 찾기

class Solution_255 {

    public int solution(String param, String target) {

        return param.toUpperCase().contains(target.toUpperCase()) ? 1 : 0;

    }

}