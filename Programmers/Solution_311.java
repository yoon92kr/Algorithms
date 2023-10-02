// 문제 : 왼쪽 오른쪽

class Solution_311 {

    public String[] solution(String[] str_list) {

        String str = String.join("", str_list);

        int lIdx = str.indexOf("l");
        int rIdx = str.indexOf("r");

        if (lIdx == -1 && rIdx == -1) {
            return new String[0];
        } else if (lIdx < rIdx || rIdx == -1) {
            str = str.substring(0, lIdx);
        } else if (lIdx > rIdx || lIdx == -1) {
            str = str.substring(rIdx, str.length());
        }

        return str.split("");

    }

}
