import java.util.ArrayList;
import java.util.Scanner;

public class TaskListApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> taskList = new ArrayList<>();

        boolean exit = false;

        while (!exit) {
            System.out.println("\nTask List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. List Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (option) {
                case 1:
                    System.out.print("Enter task description: ");
                    String task = scanner.nextLine();
                    taskList.add(task);
                    System.out.println("Task added.");
                    break;
                case 2:
                    if (taskList.isEmpty()) {
                        System.out.println("Task list is empty.");
                    } else {
                        System.out.println("Current tasks:");
                        for (int i = 0; i < taskList.size(); i++) {
                            System.out.println((i + 1) + ". " + taskList.get(i));
                        }
                        System.out.print("Enter task number to remove: ");
                        int taskIndexToRemove = scanner.nextInt();
                        if (taskIndexToRemove >= 1 && taskIndexToRemove <= taskList.size()) {
                            taskList.remove(taskIndexToRemove - 1);
                            System.out.println("Task removed.");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;
                case 3:
                    if (taskList.isEmpty()) {
                        System.out.println("Task list is empty.");
                    } else {
                        System.out.println("Task List:");
                        for (int i = 0; i < taskList.size(); i++) {
                            System.out.println((i + 1) + ". " + taskList.get(i));
                        }
                    }
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting the Task List Application.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
