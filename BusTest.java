package sparta;

public class BusTest {
    public static void main(String[] args) {

        Bus bus1 = new Bus();
        Bus bus2 = new Bus();


        bus1.startEngine();
        // 승객 탑승
        bus1.board(2);

        //주유량 변경
        bus1.reFuel(-50);

        // 버스 상태 변경 차고지행 -> 인원을 다 비운다
        bus1.setState(false);

        //버스 주유량 변경
        bus1.reFuel(10);

        // 버스 상태
        bus1.setState(true);

        //버스 과인원 탑승
        bus1.board(45);

        //버스 승객 5명 탑승
        bus1.board(5);

        //주유량 변경
        bus1.reFuel(-55);
    }
}
