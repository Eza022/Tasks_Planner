package org.example;

import java.util.Scanner;

public class DayPlannerApp {
    public static void main(String[] args) {
        DayPlanner dayPlanner = new DayPlanner();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Day Planner Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Edit Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    // Add a task
                    System.out.print("Enter the task title: ");
                    String taskTitle = scanner.nextLine();
                    System.out.print("Enter the task description: ");
                    String taskDescription = scanner.nextLine();
                    System.out.print("Enter the task start time: ");
                    String taskStartTime = scanner.nextLine();
                    System.out.print("Enter the task end time: ");
                    String taskEndTime = scanner.nextLine();
                    System.out.print("Enter the task priority: ");
                    int taskPriority = scanner.nextInt();

                    Task task = new Task(taskTitle, taskDescription, taskStartTime, taskEndTime, taskPriority);
                    dayPlanner.addTask(task);
                    break;
                case 2:
                    // View tasks
                    System.out.println("Tasks in the Day Planner:");
                    dayPlanner.viewTasks();
                    break;
                case 3:
                    // Edit task
                    System.out.print("Enter the task number you want to edit: ");
                    int taskIndexToEdit = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter the new task description: ");
                    String newTaskDescription = scanner.nextLine();
                    dayPlanner.editTask(taskIndexToEdit - 1, newTaskDescription);
                    break;
                case 4:
                    // Delete task
                    System.out.print("Enter the task number you want to delete: ");
                    int taskIndexToDelete = scanner.nextInt();
                    dayPlanner.deleteTask(taskIndexToDelete - 1);
                    break;
                case 5:
                    // Exit the application
                    System.out.println("Exiting Day Planner. Have a great day!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }
}

