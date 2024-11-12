import java.util.ArrayList;

public class Practicum {

    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task(Task.TaskPriority.HIGH, "Оплатить интернет."));
        tasks.add(new Task(Task.TaskPriority.LOW, "Сходить в парикмахерскую."));
        tasks.add(new Task(Task.TaskPriority.MEDIUM, "Выбрать подарок подруге на ДР."));
        tasks.add(new Task(Task.TaskPriority.MEDIUM, "Купить билеты в театр."));
        tasks.add(new Task(Task.TaskPriority.HIGH, "Посетить вебинар по английскому языку."));
        tasks.add(new Task(Task.TaskPriority.LOW, "Купить пылесос."));

        System.out.println("Задачи с наивысшим приоритетом на сегодня:");
        for (Task task : tasks) {
            if (task.getPriority() == Task.TaskPriority.HIGH) {
                System.out.println(task.getDescription());
            }
        }
    }
}