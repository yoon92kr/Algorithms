// 문제 : 리스트 자르기

class Solution_302 {

    public int[] solution(int n, int[] slicer, int[] num_list) {

        int startIdx = 0;
        int endIdx = num_list.length;
        int interval = 1;

        switch (n) {
            case 1: // 0 부터 b 인덱스까지
                endIdx = slicer[1];
                break;
            case 2: // a 인덱스 부터 마지막까지
                startIdx = slicer[0];
                break;
            case 3: // a 인덱스 부터 b 인덱스까지
                startIdx = slicer[0];
                endIdx = slicer[1];
                break;
            case 4: // a 인덱스 부터 b 인덱스까지 + c 간격
                startIdx = slicer[0];
                endIdx = slicer[1];
                interval = slicer[2];
                break;
        }
        int len = endIdx - startIdx + 1;
        boolean hasInterval = interval != 1;
        int[] result = new int[len - (hasInterval ? (int) Math.ceil(len / interval) : len)];
        int idx = 0;

        for (int i = startIdx; i < endIdx; i += interval) {
            result[idx] = num_list[i];
            idx++;
        }

        return result;

    }

}