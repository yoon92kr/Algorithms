// 문제 : 조건 문자열

class Solution_296 {

    public int solution(String ineq, String eq, int n, int m) {

        boolean result = true;

        if (ineq.equals(">")) {
            if (eq.equals("=")) {
                result = n >= m;
            } else {
                result = n > m;
            }
        } else if (ineq.equals("<")) {
            if (eq.equals("=")) {
                result = n <= m;
            } else {
                result = n < m;
            }
        }

        return result ? 1 : 0;

    }

}