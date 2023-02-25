package Homework_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Calendar <T extends BaseTask> {
    private List <T> tasks = new ArrayList <> ();

    public Calendar(List <T> tasks) {
        this.tasks = tasks;
    }

    public void addTask (T baseTask) {
        tasks.add(baseTask);
    }

    public void remove (T baseTask) {
        tasks.remove(baseTask);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (BaseTask basetask : tasks
             ) {
            builder.append(basetask.getInfo() + "\n");
        }
        return "Calendar{" +
                "tasks=" + builder +
                '}';
    }


}
