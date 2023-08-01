// 문제 : 접미사인지 확인하기

class Solution_251 {

    public int solution(String target, String suffix) {

        if (suffix.length() > target.length()) {
            return 0;
        }

        return target.substring(target.length() - suffix.length()).equals(suffix) ? 1 : 0;

    }

}