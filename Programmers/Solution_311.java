// 문제 : 왼쪽 오른쪽

class Solution_311 {

    public String[] solution(String[] str_list) {

        String str = String.join("", str_list);

        int lIdx = str.indexOf("l");
        int rIdx = str.indexOf("r");

        // l, r 문자가 없을 경우 빈 배열을 반환한다.
        if (lIdx == -1 && rIdx == -1) {
            return new String[0];
        }

        // l 또는 r 문자가 없을 경우(-1) 최대값(20)으로 변경한다.
        lIdx = lIdx == -1 ? 20 : lIdx;
        rIdx = rIdx == -1 ? 20 : rIdx;

        if (lIdx < rIdx) {
            str = str.substring(0, lIdx);
        } else if (lIdx > rIdx) {
            str = str.substring(rIdx + 1, str.length());
        }

        return str.length() == 0 ? new String[0] : str.split("");

    }

}
