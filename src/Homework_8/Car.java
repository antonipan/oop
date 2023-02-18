package Homework_8;



/*
Напишите класс Car.
        В классе должна храниться следующая информация:
        название автомобиля  - model;
        год выпуска - year;
        стоимость - price;
        цвет - color;
        объем двигателя - power.

        Добавьте в класс Car метод getInfo без параметров, который будет печать на экране значения полей объекта класса  model , power и yeare.{
*/

/*Доработайте класс Car.
        В классе должна храниться следующая информация:
        Свойство - которое говорит заведен авто или нет
        Метод - запуска автомобиля
        Метод - остановки автомобиля
        Метод дороги - при вызове, в качестве аргумента передаем место назначения
        И если авто заведён - выводим, что мы на такой-то авто едем место назначения
        Если не заведён - сообщить, что авто не заведено. И мы не можем ехать*/
import java.time.Year;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Car {
    private String model;
    private int year;
    private int price;
    private String color;
    private int power;
    private boolean startcar;
    private boolean crash;
    private int run;
    private int ball;


    public void getInfoCar () {
        System.out.println("Авто: {" +
                "Модель ='" + model + '\'' +
                ", год выпуска =" + year +
                ", цена =" + price +
                ", цвет ='" + color + '\'' +
                ", мощность двигателя = " + power + '}');
    }
    public void getInfoCar (Car car) {
        System.out.println("Авто: {" +
                "Зажигание ='" + startcar + '\'' +
                ", Наличие поломок = " + crash +
                ", пробег ='" + run + '\'' +
                ", общий балл = " + ball + '}');
    }

    public Car (String model, int year, int price, String color) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.startcar = false;
        this.ball = 0;

    }

    public Car() {
        this.ball = 0;
    }
    // метод зажигания
    public void ignition () {
        if (startcar) {
            startcar = false;
        } else {
            startcar = true;
        }
    }
    // Метод получения информации о состоянии машины
    public void getIgnition () {
        if (startcar) {
            System.out.println("Машина заведена");
        } else {
            System.out.println("Машина заглушена");
        }
    }

    public void setModel (String model) {
        this.model = model;
    }
    public void setYear (int year) {
        this.year = year;
    }
    public void setPrice (int price) {
        this.price = price;
    }
    public void setColor (String color) {
        this.color = color;
    }
//    public void setDistance (int distance) {
//        this.distance = distance;
//    }
    public void setPower (int power) {
        this.power = power;
    }
    public void setRun (int run) {
        this.run = run;
    }
    public void setCrash () {
        this.crash = true;
    }

    public void drive (int distance) {
        Random random = new Random();
        int way = 0;
        if (startcar) {
            way = random.nextInt(0, 100);
            distance = distance - way;
            System.out.println("Вы проехали: " + way);
            System.out.println("До пункта назначения осталось: " + distance);
            if (distance <= 0) {
                System.out.println("Вы приехали");
            }
        } else {
            System.out.println("Заведите машину");
        }
    }

    // метод начисления баллов автомобилю

    public int countBall () {
        int count = 0;
        ball = (100 - run /10000);
        count += ball;
        System.out.println("Балл за пробег: " + ball);
        ball = (100 - (Year.now().getValue() - year));
        count += ball;
        System.out.println("Балл за год выпуска: " + ball);
        if (crash) {
            ball = -50;
        } else {
            ball = 50;
        }
        count += ball;
        System.out.println("Балл за наличие аварий: " + ball);
        ball = (power/10);
        count += ball;
        System.out.println("Балл за мощность двигателя: " + ball);
        System.out.println("Итого: " + count);

        return ball = count;
    }

    public void compare (Object obj) {
        if (this == obj) {
            System.out.println("Вы сравниваете один и тот же объект");
        }
        if (!(obj instanceof Car)) {
            System.out.println("Сравниваемый объект не авто.");
        }
        Car car = (Car) obj;
        if (ball > car.ball) {
            System.out.println("Предпочтение нужно отдать модели" + model + ". Её балл: " + ball);
        } else if (ball == car.ball) {
            System.out.println("Обе машниы одинаковы" + ball);
        } else {
            System.out.println("Предпочтение нужно отдать модели " + car.model + ". Её балл: " + car.ball);
        }
    }


    public static void rally (Car car1, Car car2, int distance) throws InterruptedException {
        Random random = new Random();
        distance = random.nextInt(10, 15)*100;
        System.out.println("дистанция соревнования = " + distance);

        int way1 = 0;
        int way2 = 0;
        while (way1 < distance && way2 < distance) {
            TimeUnit.SECONDS.sleep(1);
            way1 = way1 + random.nextInt(0, 10)*10;
            System.out.print(car1.model + " - " + way1 + " ");
            way2 = way2 + random.nextInt(0, 10)*10;
            System.out.println(car2.model + " - " + way2);

        }
        if (way1 > distance) {
            System.out.println("Победил " + car1.model);
        } else if (way2 > distance) {
            System.out.println("Победил " + car2.model);
        }
    }




}
