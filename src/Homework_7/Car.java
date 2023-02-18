package Homework_7;



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
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Car {
    String model;
    int year;
    int price;
    String color;
    int power;
    boolean startcar;
    int distance;
    String crash;
    int run;
    int ball;


    public void getInfo() {
        System.out.println("Авто: {" +
                "Модель ='" + model + '\'' +
                ", год выпуска =" + year +
                ", цена =" + price +
                ", цвет ='" + color + '\'' +
                ", мощность двигателя =" + power +
                ", балл " + ball + '}');
    }

    public Car (String model, int year, int price, int distans) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.startcar = false;
    }

    public Car () {

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

    public void drive () {
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

    public static int countBall (Car car) {
        int ball = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите пробег автомобиля " + car.model + " ");
        car.run = scanner.nextInt();
        ball = ball + (100 - car.run /10000);
        System.out.println(ball);
        System.out.print("Укажите год выпуска автомобиля ");
        car.year = scanner.nextInt();
        ball = ball+(100 - (Year.now().getValue() - car.year));
        System.out.println(ball);

        System.out.println("Был ли автомобиль в аварии");
        car.crash = scanner.nextLine();
        if (car.crash.equals("да")) {
            ball = ball - 50;
        } else {
            ball = ball + 50;
        }
        System.out.println(ball);

        System.out.print("Укажите мощность двигателя автомобиля л.с. ");
        car.power = scanner.nextInt();
        ball = ball + (car.power/10);
        System.out.println("Общий балл " + ball);
        return car.ball = ball;
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


    public void rally (Car car) throws InterruptedException {
        Random random = new Random();
        distance = random.nextInt(2000, 4000);
        System.out.println("дистанция соревнования = " + distance);

        int way1 = 0;
        int way2 = 0;
        while (way1 < distance && way2 < distance) {
            TimeUnit.SECONDS.sleep(1);
            way1 = way1 + random.nextInt(0, ball);
            System.out.print(model + " - " + way1 + " ");
            way2 = way2 + random.nextInt(0, car.ball);
            System.out.println(car.model + " - " + way2);

        }
        if (way1 > distance) {
            System.out.println("Победил " + model);
        } else if (way2 > distance) {
            System.out.println("Победил " + car.model);
        }
    }




}
