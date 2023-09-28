// 문제 : 두 수의 합

import java.math.BigInteger;

class Solution_310 {

    public String solution(String a, String b) {

        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);

        return numA.add(numB).toString();

    }

}