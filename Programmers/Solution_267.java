// 문제 : 배열의 원소 삭제하기

import java.util.ArrayList;

class Solution_267 {

    public int[] solution(int[] mainList, int[] deleteList) {

        ArrayList<Integer> mainArr = convertArr(mainList);
        ArrayList<Integer> deleteArr = convertArr(deleteList);
        ArrayList<Integer> resultArr = new ArrayList<>();

        for (int item : mainArr) {
            if (!deleteArr.contains(item)) {
                resultArr.add(item);
            }
        }

        return resultArr.stream().mapToInt(Integer::intValue).toArray();
    }

    private ArrayList<Integer> convertArr(int[] param) {
        int runCnt = param.length;
        ArrayList<Integer> resultArr = new ArrayList<Integer>();

        for (int i = 0; i < runCnt; i++) {
            resultArr.add(param[i]);
        }

        return resultArr;
    }

}