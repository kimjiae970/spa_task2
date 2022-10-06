package sparta;

public class Taxi extends Transport {

    String destination; //목적지
    int distance; //거리
    int perDistancePrice = 1000; // 거리당 요금
    int cuttentPassenger = 0; //승객수

    int defaultDistance = 1; //기본거리
    int defaultPrice = 3000; // 가본 요금
    int totalPrice = 0;
    int totalmoney = 0;


    public Taxi() {
       this.carNumber = (int)(Math.random() * 9999);
       this.maxPassenger = 4;
       this.fuelVolume = 100;
       this.state = "운행 전";
       this.speed = 0;


        System.out.println(carNumber + "번 택시");
        chechFuel();

    }
    //출발 전 확인
    void chechFuel(){
        System.out.println("주유량 = "+ fuelVolume);
        if(fuelVolume > 10){
            this.state = "일반";
        }
        System.out.println("상태 = "+ state);
    }
    //승객 탑승
    void board(int passenger,String destination,int distance) {
        cuttentPassenger = 0;
        if (passenger > maxPassenger - cuttentPassenger) {
            System.out.println("최대 승객 수 초과");
        } else {
            cuttentPassenger += passenger;
            this.destination = destination;
            this.distance = distance;
            if (state.equals("일반")) {
                System.out.println("탑승 승객 수 =" + passenger);
                System.out.println("잔여 승객 수 =" + (maxPassenger - cuttentPassenger));
                System.out.println("기본 요금 확인 =" + defaultPrice);
                System.out.println("목적지 = " + destination);
                System.out.println("목적지까지 거리 =" + distance + "km");
                totalPrice= (defaultPrice + ((distance - defaultDistance) * perDistancePrice));
                System.out.println("지불할 요금 = " + totalPrice);
                state = "운행중";
                System.out.println("상테 =" + state);
            } else if (state.equals("운행중")) {
                System.out.println("탑승 승객 수 =" + passenger);
                System.out.println("잔여 승객 수 =" + (maxPassenger - cuttentPassenger));
                System.out.println("기본 요금 확인 =" + defaultPrice);
                System.out.println("목적지 = " + destination);
                System.out.println("목적지까지 거리 =" + distance + "km");
                totalPrice= (defaultPrice + ((distance - defaultDistance) * perDistancePrice));
                System.out.println("지불할 요금 = " + totalPrice);
            }
        }

    }
    void board(int passenger){
        if (passenger > maxPassenger - cuttentPassenger) {
            System.out.println("최대 승객 수 초과");
        } else {
            cuttentPassenger += passenger;
        }
    }

    void pay(){
        totalmoney += totalPrice;
        totalPrice = 0;
        if(fuelVolume <= 10 ){
            System.out.println("주유가 필요합니다");
            System.out.println("주유량 = " + fuelVolume);
            state = "운행불가";
            System.out.println("상태 = " + state);
            System.out.println("누적 요금 =" + totalmoney);
        }
    }

     void reFuel(int fuel) {
         fuelVolume += fuel;

         if (fuelVolume < 10) {
         } else {
             if (state.equals("운행중")) {
                 System.out.println("주유량 = " + fuelVolume);
                 System.out.println("누적 요금= " + totalPrice);

             }
         }
     }}






