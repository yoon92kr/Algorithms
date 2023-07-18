// 문제 : 공원 산책

class Solution_237 {

    private String[] verticalMap;
    private int[] result = new int[2];
    private int[] maxDistance = new int[2];

    public int[] solution(String[] horizontalMap, String[] routes) {

        verticalMap = makePark(horizontalMap, horizontalMap[0].length(), horizontalMap.length);

        for (int i = 0; i < routes.length; i++) {

        }

        return result;

    }

    private String[] makePark(String[] park, int width, int height) {
        String[] verticalMap = new String[width];
        String newMap;
        maxDistance[0] = height - 1;
        maxDistance[1] = width - 1;

        for (int i = 0; i < width; i++) {
            newMap = "";
            for (int j = 0; j < height; j++) {
                if (park[i].charAt(j) == 'S') {
                    result[0] = i;
                    result[1] = j;
                }
                newMap += park[j].charAt(i);
            }
            verticalMap[i] = newMap;
        }
        return verticalMap;
    }

    // param[0] : direction
    // param[1] : distance
    private void move(String[] param) {
        int expLct;
        // 공원을 벗어나는지 유무를 확인한다.
        switch (param[0]) {
            case "E":
            case "W":
            case "N":
            case "S":
        }

        // 경로에 장애물이 포함되어있는지 유무를 확인한다.

    }

}
