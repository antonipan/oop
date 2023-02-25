package Homework_10;

import java.time.LocalDate;

public class HomeTask extends BaseTask {


    public HomeTask(String nameTask, int priority, String dataStart, String dataFinish) {
        super(nameTask, priority, dataStart, dataFinish);
    }

    public String getInfo () {
        return "BaseTask{" +
                    "nameTask='" + getNameTask() + '\'' +
                    ", priority=" + getPriority() +
                    ", dataStart='" + getDataStart() + '\'' +
                    ", dataFinish='" + getDataFinish() + '\'' +
                    ", deadline=" + getDeadline() +
                    '}';
    }

    @Override
    public void statusTask() {
        LocalDate dateNow = LocalDate.now();
        if (dateNow.isBefore(getDataStart())) {
            System.out.println("Задача ещё не началась");
        } else if (dateNow.isAfter(getDataStart()) && dateNow.isBefore(getDataFinish())) {
            System.out.println("Задача выполняется");
        } else if (dateNow.isAfter(getDataFinish())) {
            System.out.println("Задача выполнена");
        }
    }
}
