// 문제 : 타겟 넘버

class Solution_335 {

    public int makeCount = 0;

    public int solution(int[] numbers, int target) {

        dfs(0, numbers.length - 1, numbers, 0, target);
        return makeCount;

    }

    private void dfs(int idx, int lastIdx, int[] numbers, int value, int target) {

        if (idx > lastIdx) {
            makeCount += value == target ? 1 : 0;
        } else {
            dfs(idx + 1, lastIdx, numbers, value + numbers[idx], target);
            dfs(idx + 1, lastIdx, numbers, value - numbers[idx], target);
        }

    }

}
