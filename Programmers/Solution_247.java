// 문제 : 수 조작하기 1

class Solution_247 {

    public int solution(int n, String control) {
        int runCnt = control.length();
        int result = 0;
        String[] controlArr = control.split("");

        for (int i = 0; i < runCnt; i++) {
            result += move(controlArr[i]);
        }

        return result;
    }

    private int move(String command) {
        switch (command) {
            case "w":
                return 1;
            case "s":
                return -1;
            case "d":
                return 10;
            case "n":
                return -10;
        }

        return 0;
    }

}