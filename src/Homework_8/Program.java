package Homework_8;

public class Program {
    public static int distance;
    public static void main(String[] args) throws InterruptedException {
    /* Автомобили */
        Car mazda = new Car();
        mazda.getInfoCar();
        mazda.setModel("Mazda");
        mazda.setColor("white");
        mazda.setPrice(1000);
        mazda.setYear(2020);
        mazda.setPower(180);
        mazda.getInfoCar();
        mazda.getInfoCar(mazda);
        mazda.setRun(100_000);
        mazda.setCrash();
        mazda.countBall();
        mazda.getInfoCar(mazda);
        mazda.ignition();
//        mazda.drive(distance = 1000); нужно доработать.
        Car toyota = new Car("Toyota", 2014, 200_000, "black");
        toyota.ignition();
        toyota.getInfoCar();
        toyota.getInfoCar(toyota);
        toyota.setRun(480_000);
        toyota.setPower(150);
        toyota.countBall();
        toyota.getInfoCar(toyota);
        toyota.compare(mazda);
        Car.rally(mazda, toyota, distance);


        /* Вендинг машина*/
//        VendingAuto vm1 = new VendingAuto(10);
//        vm1.addProductToVending(new Product("apple", 128.00));
//        vm1.addProductToVending(new Product("meat", 400.00));
//        vm1.addProductToVending(new Product("banana", 65.00));
//        vm1.addProductToVending(new Product("Chips", 118.00));
//        vm1.addProductToVending(new Product("jus", 98.00));
//        System.out.println(vm1);
//        vm1.getCostAllProduct();
//        System.out.println();
//        vm1.getFreeCell();
//        vm1.buyProduct();
//        vm1.getFreeCell();
//        System.out.println(vm1);

    }
}
