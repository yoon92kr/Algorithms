// 문제 : 특정한 문자를 대문자로 바꾸기

class Solution_252 {

    public String solution(String param, String target) {

        return param.replace(target, target.toUpperCase());

    }

}