// 문제 : 전화번호 목록

class Solution_330 {

    public boolean solution(String[] phone_book) {
        int runCnt = phone_book.length;

        for (int i = 0; i < runCnt; i++) {
            for (int j = 0; j < runCnt; j++) {
                if (j != i && phone_book[j].startsWith(phone_book[i])) {
                    return false;
                }
            }
        }

        return true;
    }

}