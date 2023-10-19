// 문제 : 기능개발

import java.util.ArrayList;

class Solution_325 {

    public int[] solution(int[] progresses, int[] speeds) {

        boolean isDone = true;
        int idx = 0, completeJob = 0;
        int runCnt = progresses.length;
        ArrayList<Integer> list = new ArrayList<>();

        while (isDone) {

            // 하루가 지날 때 마다 진도율을 개발 속도 만큼 증가
            for (int i = idx; i < runCnt; i++) {
                progresses[i] += speeds[i];
            }

            // 우선순위 작업이 개발 완료되었을 경우 배포를 시행
            if (progresses[idx] >= 100) {
                completeJob = 0; // 완료 작업 카운트 초기화

                // 이후 작업 중 개발이 완료된 기능이 있을 경우 함께 배포
                for (int j = idx; j < runCnt; j++) {
                    if (progresses[j] >= 100) {
                        completeJob++;
                        idx++;
                    } else {
                        break;
                    }
                }
                list.add(completeJob);

                // 최종 작업까지 완료되면 작업을 종료
                if (idx == runCnt) {
                    isDone = false;
                }
            }

        }

        return list.stream().mapToInt(Integer::intValue).toArray();

    }

}