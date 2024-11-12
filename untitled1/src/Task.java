package Task;
public class Task {
    public enum TaskPriority {
        HIGH,
        MEDIUM,
        LOW
    }
    private TaskPriority priority;
    private String description;

    public Task(TaskPriority priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }
}
