// 문제 : 전화번호 목록

import java.util.Arrays;

class Solution_330 {

    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        int runCnt = phone_book.length - 1;

        for (int i = 0; i < runCnt; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return true;
    }

}