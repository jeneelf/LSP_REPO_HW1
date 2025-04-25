package org.howard.edu.lspfinal.question2;

/**
 * Represents class structure for a Task With task details
 */
public class Task {
    private String name;
    private int priority;
    private String status;

    /**
     * initialize a Task object
     * @param name Name of the task
     * @param priority Priority level of the task (1-10)
     * @param status Status of the task
     */
    public Task(String name, int priority, String status) {
        this.name = name;
        this.priority = priority;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + ", status='" + status + "'}";
    }
}
