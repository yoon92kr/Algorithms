// 문제 : 수 조작하기 2

class Solution_282 {

    public String solution(int[] numLog) {

        int runCnt = numLog.length - 1;
        StringBuffer sb = new StringBuffer();

        for (int i = runCnt; i > 0; i--) {

            switch (numLog[i] - numLog[i - 1]) {
                case 1:
                    sb.append('w');
                    break;
                case -1:
                    sb.append('s');
                    break;
                case 10:
                    sb.append('d');
                    break;
                case -10:
                    sb.append('a');
                    break;
            }
        }

        return sb.reverse().toString(); // 역순으로 조작값을 파악하였기 때문에 뒤집는다

    }

}