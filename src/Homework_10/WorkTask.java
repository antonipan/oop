package Homework_10;

import java.time.LocalDate;

public class WorkTask extends BaseTask implements Salary {

    private String responsible;


    public WorkTask(String nameTask, int priority, String dataStart, String dataFinish, String responsible) {
        super(nameTask, priority, dataStart, dataFinish);
        this.responsible = responsible;
    }

    public String getInfo () {
        return "BaseTask{" +
                "Задача='" + getNameTask() + '\'' +
                ", Приоритет=" + getPriority() +
                ", responsible='" + getResponsible() + '\'' +
                ", dataStart='" + getDataStart() + '\'' +
                ", dataFinish='" + getDataFinish() + '\'' +
                ", deadline=" + getDeadline() +
                '}';
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public void statusTask() {
        LocalDate dateNow = LocalDate.now();
        if (dateNow.isBefore(getDataStart())) {
            System.out.println("Задача ещё не началась");
        } else if (dateNow.isAfter(getDataStart()) && dateNow.isBefore(getDataFinish())) {
            System.out.println("Задача выполняется");
        } else if (dateNow.isAfter(getDataFinish())) {
            System.out.println("Задача выполнена");
            count++;
            sumSalary(100);
        }
    }
    public static void getCount () {
        System.out.println("Задач выполнено " + count);
    }
    public static void getSalary () {
        System.out.println("За работу получено " + salaryTask);
    }
    @Override
    public int sumSalary(int salary) {
        return salaryTask += salary;
    }
}
