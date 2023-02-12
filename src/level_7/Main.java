package level_7;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Car volvo = new Car();
        volvo.model = "Volvo";
        volvo.color = "red";
        volvo.price = 1000;
//        volvo.getInfo();
//        volvo.getIgnition();

        Car audi = new Car();
        audi.model = "Audi";
        audi.color = "White";
        audi.price = 1500;
//        audi.getInfo();
//        audi.getIgnition();

        Car.countBall(volvo);
        Car.countBall(audi);
        volvo.getInfo();
        audi.getInfo();
        volvo.compare(audi);
        volvo.rally(audi);
    }
}
