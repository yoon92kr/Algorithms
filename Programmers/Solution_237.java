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
            move(routes[i].split(" "));
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
        // 이동 방향에 따라 공원을 벗어나는지, 장애물이 존재하는지 확인 후 좌표를 이동한다
        switch (param[0]) {
            case "E":
                if (isRange("width", result[1] + moveDist))
                    result[1] += moveDist;
                break;
            case "W":
                if (isRange("width", result[1] - moveDist))
                    result[1] -= moveDist;
                break;
            case "S":
                if (isRange("height", result[0] + moveDist))
                    result[0] += moveDist;
                break;
            case "N":
                if (isRange("height", result[0] - moveDist))
                    result[0] -= moveDist;
                break;
        }

    }

    // 이동 방향[direction], 이동 후 좌표[idx]
    private boolean isRange(String direction, int idx) {
        int directionFlag = direction.equals("width") ? 1 : 0; // 이동 방향에 따른 값을 찾기 위한 flag 세로[0] 가로[1]

        // 이동 후 좌표가 공원을 벗어나는지를 확인한다
        if (idx > maxDistance[directionFlag] || idx < 0) {
            return false;
        } else {
            // 공원을 벗어나지 않는다면, 이동 경로에 장애물이 존재하는지 확인한다
            int start = Math.min(idx, result[directionFlag]); // 출발 좌표
            int end = Math.max(idx, result[directionFlag]) + 1; // 종료 좌표
            String pathInfo = directionFlag == 1 ? horizontalMap[result[0]] : verticalMap[result[1]]; // 이동 방향 경로의 정보

            if (pathInfo.substring(start, end).contains("X"))
                return false;
        }

        return true;
    }

}
