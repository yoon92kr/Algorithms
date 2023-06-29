// 문제 : 카드 뭉치

class Solution_226 {

    private int idx1, idx2 = 0;
    private int len1, len2;
    private String[] cards1, cards2;

    public String solution(String[] cards1, String[] cards2, String[] goal) {

        int runCnt = goal.length;
        setBase(cards1, cards2);

        for (int i = 0; i < runCnt; i++) {
            if (!hasCard(goal[i])) {
                return "No";
            }
        }

        return "Yes";

    }

    private void setBase(String[] cards1, String[] cards2) {

        this.cards1 = cards1;
        this.cards2 = cards2;
        len1 = cards1.length;
        len2 = cards2.length;

    }

    private boolean hasCard(String word) {

        if (idx1 < len1 && cards1[idx1].equals(word)) {
            idx1++;
            return true;
        } else if (idx2 < len2 && cards2[idx2].equals(word)) {
            idx2++;
            return true;
        }

        return false;
    }

}
