// 문제 : 원소들의 곱과 합

class Solution_257 {

    public int solution(int[] num_list) {

        int totalSum = num_list[0];
        int totalMultiply = num_list[0];

        for (int i = 1; i < num_list.length; i++) {
            totalSum += num_list[i];
            totalMultiply *= num_list[i];
        }

        return totalMultiply > Math.pow(totalSum, 2) ? 0 : 1;
    }

}