// 문제 : 문자열 뒤집기

class Solution_292 {

    public String solution(String my_string, int s, int e) {

        StringBuilder sb = new StringBuilder(my_string);
        StringBuilder target = new StringBuilder(my_string.substring(s, e + 1)); // 교체할 대상 추출

        return sb.replace(s, e + 1, target.reverse().toString()).toString(); // 변경할 구간에 추출 대상을 뒤집어 입력

    }

}