package Homework_9;


import java.time.Year;
import java.util.Random;

/**
 * Базовый класс для автомобилей
 */
public class BaseAuto {
    public static int count;
    public static Random r;

    protected String model;
    private double power;
    private int year, ball;
    private boolean ignition;

    private int run;
    private boolean crash;

    static  {
        BaseAuto.count = 0;
        r = new Random();
    }

    public BaseAuto (String model, double power, int year) {
        this.model = model;
        this.power = power;
        this.year = year;
        this.run = 0;
        this.ball = 10;
        BaseAuto.count++;
    }

    public BaseAuto () {
        this(String.format("Model_%d", ++BaseAuto.count), 1.5,
                Year.now().getValue());
    }

    public void getInfoAuto () {
        System.out.println("Авто{" +
                "Модель='" + model + '\'' +
                ", Мощь движка=" + power +
                ", Год выпуска=" + year +
                '}');
    }
    // метод эксплуатации авто.
    public void getExpluatation () {
        System.out.println("Модель='" + model + '\'' +
                ", Урон='" + crash + '\'' +
                ", Пробег = " + run +
                ", Балл = " + ball);
    }
    // метод просмотра зажигания
    public void getIgnition () {
        if (ignition) {
            System.out.println("Машина заведена");
        } else {
            System.out.println("Машина заглушена");
        }
    }
    public boolean getCrash () {
        return crash;
    }
    public int setRun (int run) {
        return this.run +=run;
    }
    // метод включения зажигания.
    public void setIgnition () {
        if (ignition) {
            ignition = false;
        } else ignition = true;
    }

    // метод лечения машины
    public void setCrash () {
        if (crash && ball - 5 > 0) {
            crash = false;
            ball = ball - 5;
            System.out.println("Машина отремонтирована. ");
        } else if (crash && ball < 5) {
            System.out.println("не хватает баллов для починки. Запустите программу снова");
        } else {
            System.out.println("Машина не нуждается в ремонте. ");
        }
    }
    // метод случайной поломки автомобиля.
    protected void crachAuto() {
        int driver = r.nextInt(1, 8);
        int demon = r.nextInt(1, 8);
        if (driver == demon) {
            crash = true;
        }
    }
    public void setBall (int ball) {
        this.ball += ball;
    }
}
