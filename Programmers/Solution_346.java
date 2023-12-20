// 문제 : [PCCE 기출문제] 4번 / 저축

import java.util.Scanner;

class Solution_346 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = (int) (Math.pow(c, 2) - Math.pow(a, 2));

        System.out.println(b_square);

        sc.close();
    }

}