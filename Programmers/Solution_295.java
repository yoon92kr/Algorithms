// 문제 : 문자열 겹쳐쓰기

class Solution_295 {

    public String solution(String originStr, String overwriteStr, int index) {

        return originStr.substring(0, index) + overwriteStr + originStr.substring(index + overwriteStr.length());

    }

}