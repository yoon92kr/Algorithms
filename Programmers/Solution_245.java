// 문제 : 배열에서 문자열 대소문자 변환하기

class Solution_245 {

    public String[] solution(String[] strArr) {

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
        }

        return strArr;

    }

}