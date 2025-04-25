package org.howard.edu.lspfinal.question2;

import java.util.*;

/**
 * Manages a collection of tasks including adding, retrieving, updating, and grouping them.
 */
public class TaskManager {
    private Map<String, Task> tasks = new HashMap<>();
    private final Set<String> validStatuses = new HashSet<>(Arrays.asList("TODO", "IN_PROGRESS", "DONE"));

    public void addTask(String name, int priority, String status) throws DuplicateTaskException {
        if (tasks.containsKey(name)) {
            throw new DuplicateTaskException("Task '" + name + "' already exists.");
        }
        if (!validStatuses.contains(status)) {
            throw new IllegalArgumentException("Invalid status: " + status);
        }
        tasks.put(name, new Task(name, priority, status));
    }

    public Task getTaskByName(String name) throws TaskNotFoundException {
        Task task = tasks.get(name);
        if (task == null) {
            throw new TaskNotFoundException("Task '" + name + "' not found.");
        }
        return task;
    }

    public void updateStatus(String name, String newStatus) throws TaskNotFoundException {
        Task task = tasks.get(name);
        if (task == null) {
            throw new TaskNotFoundException("Task '" + name + "' not found.");
        }
        if (!validStatuses.contains(newStatus)) {
            throw new IllegalArgumentException("Invalid status: " + newStatus);
        }
        task.setStatus(newStatus);
    }

    public void printTasksGroupedByStatus() {
        System.out.println("Tasks grouped by status:");
        for (String status : validStatuses) {
            System.out.println(status + ":");
            for (Task task : tasks.values()) {
                if (task.getStatus().equals(status)) {
                    System.out.println("  " + task);
                }
            }
        }
    }
}
