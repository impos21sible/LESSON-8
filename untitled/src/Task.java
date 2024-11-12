public class Task {
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
    public enum TaskPriority {
        HIGH,
        MEDIUM,
        LOW
    }

}
