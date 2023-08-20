// 문제 : 간단한 식 계산하기

class Solution_276 {

    public int solution(String param) {

        String[] item = param.split(" ");
        int a = Integer.parseInt(item[0]);
        String operator = item[1];
        int b = Integer.parseInt(item[2]);
        int result = 0;

        if (operator.equals("+")) {
            result = a + b;
        } else if (operator.equals("-")) {
            result = a - b;
        } else {
            result = a * b;
        }

        return result;

    }

}