package sparta;

public class TaxiTest {
    public static void main(String[] args) {

        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();


        taxi1.board(2, "서울역",2);

        taxi1.reFuel(-80);
        taxi1.pay();
        taxi1.board(5);

        taxi1.board(3,"구로디지털단지역",12);

        taxi1.reFuel(-20);
        taxi1.pay();
    }
}
