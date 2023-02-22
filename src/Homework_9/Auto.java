package Homework_9;
// класс - наследник: легковой автомобиль.
public class Auto extends BaseAuto {
    private int speed;

    public Auto (String model, double power, int year, int speed) {
        super(model, power, year);
        super.setRun(0);
        super.setBall(0);
        this.speed = speed;
    }
    public void getSpeed () {
        System.out.println("Гоночная скорость = " + speed);
    }

}
