// 문제 : 수열과 구간 쿼리 2

import java.util.Arrays;

class Solution_314 {

    public int[] solution(int[] arr, int[][] queries) {

        int queriesLen = queries.length;
        int[] result = new int[queriesLen];
        int[] targetArr;

        for (int i = 0; i < queriesLen; i++) {
            // 조회할 범위의 배열을 복제한다
            targetArr = Arrays.copyOfRange(arr, queries[i][0], queries[i][1] + 1);
            Arrays.sort(targetArr);

            // 오름차순 정렬 후 가장 마지막 원소가 k보다 작거나 같을경우 -1을 입력한다
            if (targetArr[targetArr.length - 1] <= queries[i][2]) {
                result[i] = -1;
            } else {
                // 작은 순서부터 차례대로 k와 비교하여 큰 원소를 입력한다
                for (int j = 0; j < targetArr.length; j++) {
                    if (targetArr[j] > queries[i][2]) {
                        result[i] = targetArr[j];
                        break;
                    }
                }
            }

        }

        return result;

    }

}
