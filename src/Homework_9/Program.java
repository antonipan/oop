package Homework_9;

public class Program {

    public static void main(String[] args) {
        Auto toyota = new Auto("Toyota", 1.5, 2022, 200);
        toyota.getSpeed();
        // узнать об авто
        toyota.getInfoAuto();
        // узнать эксплуатац.харак-ки
        toyota.getExpluatation();
        // починить авто
        toyota.setCrash();
        // узнать зажигание
        toyota.getIgnition();
        // завести
        toyota.setIgnition();
        // узнать зажигание
        toyota.getIgnition();
        Way way = new Way(toyota);
        // узнать дистанцию
        way.getWay();
        // попробовать проезд на легковом авто
        way.menu(toyota);
        Truck west = new Truck("West", 3.0, 2020, 3);
        west.getExpluatation();
        // узнать грузоподъёмность
        west.getCargo();
        west.setIgnition();
        west.getIgnition();
        // осуществить доставку на грузовике
        way.menu(west);
        // узнать экспл.харак-ки. Пробег, наличие поломки и балл за проезд должен поменяться,
        west.getExpluatation();
        west.setCrash();
        way.menu(west);
        west.getExpluatation();
        west.setCrash();

    }
}
