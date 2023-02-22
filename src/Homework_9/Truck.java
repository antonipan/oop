package Homework_9;

// класс-наследник - грузовой автомобиль
public class Truck extends BaseAuto {
    // грузоподъёмность
    int cargo;

    public Truck (String model, double power, int year, int cargo) {
        super(model, power, year);
        this.cargo = cargo;

    }
    public void getCargo () {
        System.out.println("Грузоподъёмность = " + cargo + " тонны");
    }

}
