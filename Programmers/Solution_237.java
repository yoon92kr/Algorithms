// 문제 : 공원 산책

class Solution_237 {

    private String[] verticalMap;
    private String[] horizontalMap;
    private int[] result = new int[2];
    private int[] maxDistance = new int[2];

    public int[] solution(String[] horizontalMap, String[] routes) {

        makeVerticalMap(horizontalMap, horizontalMap[0].length(), horizontalMap.length);
        this.horizontalMap = horizontalMap;

        for (int i = 0; i < routes.length; i++) {
            move(routes[i].split(""));
        }

        return result;

    }

    // 세로 형태의 지도를 1차원 배열로 생성한다.
    private void makeVerticalMap(String[] park, int width, int height) {
        verticalMap = new String[width];
        String newMap;
        maxDistance[0] = height - 1;
        maxDistance[1] = width - 1;

        for (int i = 0; i < width; i++) {
            newMap = "";
            for (int j = 0; j < height; j++) {
                if (park[j].charAt(i) == 'S') {
                    result[0] = j;
                    result[1] = i;
                }
                newMap += park[j].charAt(i);
            }
            verticalMap[i] = newMap;
        }
    }

    // param[0] : direction
    // param[1] : distance
    private void move(String[] param) {

        int moveDist = Integer.parseInt(param[1]);
        // 공원을 벗어나는지 유무를 확인한다.
        switch (param[0]) {
            case "E":
                if (isRange("width", result[1] + moveDist)) {

                }
                break;
            case "W":
                isRange("width", result[1] - moveDist);
                break;
            case "N":
            case "S":
                break;
        }

        // 경로에 장애물이 포함되어있는지 유무를 확인한다.

    }

    private boolean isRange(String direction, int idx) {
        int distIdx = 0;
        if (direction.equals("width")) {
            distIdx = 1;
        }

        if (maxDistance[distIdx] > idx || idx < 0) {
            return false;
        }

        return true;
    }

}
