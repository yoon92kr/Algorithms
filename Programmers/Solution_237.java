// 문제 : 공원 산책

class Solution_237 {

    private String[][] newPark;
    private int[] result = new int[2];
    private int[] maxDistance = new int[2];

    public int[] solution(String[] park, String[] routes) {

        newPark = makePark(park, park[0].length(), park.length);

        for (int i = 0; i < routes.length; i++) {

        }

        return result;

    }

    private String[][] makePark(String[] park, int width, int height) {
        String[][] newPark = new String[width][height];
        maxDistance[0] = height;
        maxDistance[1] = width;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (park[i].charAt(j) == 'S') {
                    result[0] = i;
                    result[1] = j;
                }

                newPark[i][j] = Character.toString(park[i].charAt(j));
            }
        }

        return newPark;
    }

    // param[0] : direction
    // param[1] : distance
    private boolean canMove(String[] param) {
        int expLct;
        // 공원을 벗어나는지 유무를 확인한다.
        if (param[0].equals("E") || param[0].equals("W")) {

        } else {

        }
        // 경로에 장애물이 포함되어있는지 유무를 확인한다.

        return true;
    }

}
