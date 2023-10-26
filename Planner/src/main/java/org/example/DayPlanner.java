package org.example;

import java.util.ArrayList;
import java.util.List;

public class DayPlanner {
    private List<Task> tasks;

    public DayPlanner() {
        tasks = new ArrayList<>();
    }
//add a new task
    public void addTask(Task task) {
        tasks.add(task);
    }

    // Implement methods to view, edit, and delete tasks

    // View and display all tasks
    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
                System.out.println((i + 1) + ". " + task.getDescription());
            }
        }
    }

    // Edit an existing task
    public void editTask(int taskIndex, String newDescription) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            Task task = tasks.get(taskIndex);
            task.setDescription(newDescription);
            System.out.println("Task edited successfully.");
        } else {
            System.out.println("Invalid task index.");
        }
    }

    // Delete an existing task
    public void deleteTask(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            Task removedTask = tasks.remove(taskIndex);
            System.out.println("Task deleted successfully: " + removedTask.getDescription());
        } else {
            System.out.println("Invalid task index.");
        }
    }
}

