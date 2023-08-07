// 문제 : 공백으로 구분하기 2

class Solution_260 {

    public String[] solution(String param) {

        return param.trim().replaceAll("\\s*\\s", " ").split(" ");

    }

}