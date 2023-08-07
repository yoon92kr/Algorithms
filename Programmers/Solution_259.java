// 문제 : 문자열 바꿔서 찾기

class Solution_259 {

    public int solution(String myString, String pat) {

        return changeAandB(myString).contains(pat) ? 1 : 0;

    }

    private String changeAandB(String param) {

        String result = param.replace("A", "X"); // 중복을 방지하기 위한 임시 치환
        result = result.replace("B", "A");
        result = result.replace("X", "B");

        return result;
    }

}