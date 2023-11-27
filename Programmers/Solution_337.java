// 문제 : [PCCP 기출문제] 1번

class Solution_337 {

    public int solution(int[] bandage, int health, int[][] attacks) {

        int lastSec = attacks[attacks.length - 1][0];
        int time = 0, idx = 0, hp = health;

        /* 초 단위로 반복문 실행 */
        for (int i = 1; i <= lastSec; i++) {
            if (attacks[idx][0] == i) { // 공격한 시간이 현새 초와 같을경우
                time = 0;
                hp -= attacks[idx][1];
                idx++;
            } else {
                time++;
                hp += bandage[1]; // 초당 회복량 만큼 회복
                if (time == bandage[0]) {// 시전 시간이 유지될 경우 추가회복 및 초기화
                    time = 0;
                    hp += bandage[2];
                }

                if (hp > health) {
                    hp = health;
                }

            }

            if (hp <= 0) { // 캐릭터가 죽을경우 반복문 종료
                hp = -1;
                break;
            }
        }

        return hp;

    }

}