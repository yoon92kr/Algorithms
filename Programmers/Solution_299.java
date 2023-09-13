// 문제 : 문자열이 몇 번 등장하는지 세기

class Solution_299 {

    public int solution(String myString, String target) {

        int targetLen = target.length();
        int runCnt = myString.length() - targetLen + 1;
        int count = 0;

        for (int i = 0; i < runCnt; i++) {
            count += myString.substring(i, i + targetLen).equals(target) ? 1 : 0;
        }

        return count;

    }
}