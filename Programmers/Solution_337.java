// 문제 : 에어컨

class Solution_337 {

    int minCost, cost, on, keep;

    public int solution(int temperature, int t1, int t2, int a, int b, int[] onboard) {

        setOption(a, b, onboard.length);

        for (int i = 0; i < onboard.length; i++) {
            dff(temperature, t1, t2, 0);
        }

        return minCost;
    }

    private void setOption(int onPower, int keepPower, int len) {
        this.minCost = Math.max(onPower, keepPower) * len;
        this.cost = 0;
        this.on = onPower;
        this.keep = keepPower;
    }

    private void dff(int temp, int minTemp, int maxTemp, int usePower) {

    }

    private void powerOff() {
        this.cost = 0;
    }

    private void powerOn() {
        this.cost = on;
    }

    private void keepTemp() {
        this.cost = keep;
    }

}