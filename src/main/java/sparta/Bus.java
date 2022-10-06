package sparta;

public class Bus extends Transport {

    int cuttentPassenger = 0; // 현재 승객 수
    int price = 1000;  // 요금


    //버스 객체 생성자 => 버스 번호 고유번호 생성
    public Bus() {
        this.carNumber = (int) (Math.random() * 1000) + 1;
        this.maxPassenger = 30;
        this.state = "운행";
        System.out.println(carNumber + "번 버스");
    }

    // 버스 상태 변경
    public void setState(boolean change) {
        if (change == true) {
            this.state = "운행중";
        } else {
            this.state = "차고지행";
            cuttentPassenger = 0;
        }
        System.out.println(state);
    }

    //버스 승객 태우기
    void board(int passenger) { // 탑승하는 만큼 매개변수로 받아오기
        if (passenger > maxPassenger - cuttentPassenger) {
            System.out.println("최대 승객 수 초과");
        } else {
            cuttentPassenger += passenger;
            System.out.println("탑승 승객 수 = " + passenger);
            System.out.println("잔여 승객 수 = " + (maxPassenger - cuttentPassenger));
            System.out.println("요금 확인 = " + (price * passenger));
        }
    }

    void reFuel(int fuel){
        fuelVolume += fuel;

        if(fuelVolume < 10){
            System.out.println("주유가 필요합니다");
            System.out.println("주유량 = "+ fuelVolume);
            state = "차고지행";
            System.out.println("상태 = "+state);
            
        }else{
            if(state.equals("운행중")){
            System.out.println("주유량 = "+ fuelVolume);
            }else if(state.equals("차고지행")){
                System.out.println("상태 = "+state);
                System.out.println("주유량 = "+ fuelVolume);
            }
        }
    }

}
