// 문제 : 첫 번째로 나오는 음수

class Solution_241 {

    public int solution(int[] num_list) {
        int len = num_list.length;

        for (int i = 0; i < len; i++) {
            if (num_list[i] < 0) {
                return i;
            }
        }

        return -1;
    }

}
