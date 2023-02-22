package Homework_9;

import java.util.Random;

/**
 * <Базовый класс - дорога
 */
public class Way {


    public static Random r;

    private int distance;

    static {
        r = new Random();
    }

    public Way(Object ob) {
        if (ob instanceof Auto) {
            this.distance = r.nextInt(15, 30)*100;
        } else if (ob instanceof Truck) {
            this.distance = r.nextInt(5, 15)*100;
        } else {
            System.out.println("Трасса не создалась");
        }
    }

    public void getWay () {
        System.out.println("Длина пути = " + distance);
    }

    private void delivery (Truck truck) {
        int speedTruck = 100 - truck.cargo*10;
        int way = 0;
        while (way < distance) {
            way += speedTruck;
            truck.crachAuto();
            if (truck.getCrash()) {
                System.out.printf("Авто сломалось. Вы не доехали. Осталось %d. Почините\n", distance - way);
                break;
            }
            System.out.println("Вы проехали " + way);
        }
        if (way > distance) {
            System.out.println("Ура! вы приехали");
        }
        truck.setRun(way);
        truck.setBall(way/100);
    }

    public void menu (Object ob) {
        if (ob instanceof Truck) {
            delivery((Truck) ob);
        } else {
            System.out.println("Функционал пока в разработке...");
        }
    }



}
