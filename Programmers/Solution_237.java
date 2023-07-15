// 문제 : 공원 산책

class Solution_237 {

    public int[] solution(String[] park, String[] routes) {
        int[][] aaa = new int[park.length][park[0].length()];// [3][4]

        int p1 = 0;// 큰배열 인덱스
        int p2 = 0;// 작은배열의 위치

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    aaa[i][j] = 8;
                    p1 = i;
                    p2 = j;
                } else if (park[i].charAt(j) == 'O') {
                    aaa[i][j] = 0;
                } else if (park[i].charAt(j) == 'X') {
                    aaa[i][j] = 1;
                }
            }
        } // 맵 만들기 끝

        for (int i = 0; i < routes.length; i++) {
            String[] split = routes[i].split(" ");

            if (p1 > park.length - 1 || p2 > routes.length - 1) {
                break;
            }

            if (split[0].equals("E")) { // 동쪽이면 p2가 이동해야함
                boolean check = true;
                for (int j = p2 + 1; j <= p2 + Integer.parseInt(split[1]); j++) {

                    if (j > aaa[p1].length - 1) {
                        check = false;
                        break;
                    }

                    if (aaa[p1][j] == 1) {
                        check = false;
                        break;
                    }
                }

                if (check == true) {
                    p2 += Integer.parseInt(split[1]);
                    aaa[p1][p2] = 8;
                    aaa[p1][p2 - Integer.parseInt(split[1])] = 0;
                }

            } else if (split[0].equals("S")) { // p1,p2
                boolean check = true;
                for (int j = p1 + 1; j <= p1 + Integer.parseInt(split[1]); j++) {

                    if (j > aaa.length - 1) {
                        check = false;
                        break;
                    }

                    if (aaa[j][p2] == 1) {
                        check = false;
                        break;
                    }
                }

                if (check == true) {
                    p1 += Integer.parseInt(split[1]);
                    aaa[p1][p2] = 8;
                    aaa[p1 - Integer.parseInt(split[1])][p2] = 0;
                }

            } else if (split[0].equals("W")) {
                boolean check = true;
                for (int j = p2 - 1; j >= p2 - Integer.parseInt(split[1]); j--) {

                    if (j < 0) {
                        check = false;
                        break;
                    }

                    if (aaa[p1][j] == 1) {
                        check = false;
                        break;
                    }
                }

                if (check == true) {
                    p2 -= Integer.parseInt(split[1]);
                    aaa[p1][p2] = 8;
                    aaa[p1][p2 + Integer.parseInt(split[1])] = 0;
                }

            } else if (split[0].equals("N")) {
                boolean check = true;
                for (int j = p1 - 1; j >= p1 - Integer.parseInt(split[1]); j--) {

                    if (j < 0) {
                        check = false;
                        break;
                    }

                    if (aaa[j][p2] == 1) {
                        check = false;
                        break;
                    }
                }

                if (check == true) {
                    p1 -= Integer.parseInt(split[1]);
                    aaa[p1][p2] = 8;
                    aaa[p1 + Integer.parseInt(split[1])][p2] = 0;
                }
            }

        }

        int[] answer = new int[2];
        answer[0] = p1;
        answer[1] = p2;
        return answer;
    }

}
