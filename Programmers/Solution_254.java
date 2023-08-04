// 문제 : 꼬리 문자열

class Solution_254 {

    public String solution(String[] param, String ignored) {

        String result = "";
        int runCnt = param.length;

        for (int i = 0; i < runCnt; i++) {
            if (!param[i].contains(ignored)) {
                result += param[i];
            }
        }

        return result;

    }

}