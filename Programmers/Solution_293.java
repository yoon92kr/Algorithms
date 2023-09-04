// 문제 : 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기

class Solution_293 {

    public String solution(String myString, String pat) {

        /* 시작점 부터 pat이 위치한 index까지를 잘라 반환 */
        return myString.substring(0, myString.lastIndexOf(pat) + pat.length());

    }

}