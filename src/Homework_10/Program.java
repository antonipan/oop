package Homework_10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalField;
import java.util.*;

public class Program {

    public static void main(String[] args) {

        HomeTask task1 = new HomeTask("Пропылесосить", 3, "2023-02-24", "2023-02-28");
        System.out.println(task1.getInfo());
        System.out.println(task1.getDeadline());
        task1.setDeadline();
        WorkTask task2 = new WorkTask("Сдать отчёт", 1, "2023-02-23",
                                    "2023-02-26", "Медведь");
        System.out.println(task2.getInfo());
        System.out.println(task2.getDeadline());
        task2.setDeadline();
        WorkTask task3 = new WorkTask("Позвонить клиентам", 2, "2023-01-20", "2023-02-01", "Hare");
        WorkTask task4 = new WorkTask("to deliver freight", 1, "2023-02-28", "2023-03-11", "Horse");
        task1.statusTask();
        task2.statusTask();
        task3.statusTask();
        task4.statusTask();
        WorkTask task5 = new WorkTask("to recharge", 2, "2022-11-11", "2022-11-12", "Hare");
        task5.statusTask();
        WorkTask.getSalary();
        WorkTask.getCount();
        Calendar <HomeTask> calendarHome = new Calendar <>(new ArrayList<>());
        calendarHome.addTask(task1);
        Calendar <WorkTask> calendarWork = new Calendar<>(new ArrayList<>());
        calendarWork.addTask(task2);
        calendarWork.addTask(task3);
        calendarWork.addTask(task4);
        System.out.println(calendarWork);
        System.out.println(calendarHome);
    }
}
