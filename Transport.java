package sparta;

public class Transport {
    int carNumber; // 차량넘버
    int fuelVolume = 100; //주유량
    int speed; //속도
    int changeSpeed; //속도 변경
    int maxPassenger; //최대 승객 수
    String state; // 상태

    //상태 변경
    void setState(boolean change){}
    // 승객탑승
    void board(int passenger){}

    //엔진 시동
    void startEngine(){
        System.out.println("운행을 시작합니다");
    }
    //속도 변경
    public void speed(int changeSpeed) {
        this.speed += changeSpeed;
    }
}

