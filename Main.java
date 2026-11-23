import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        int choice;

        System.out.println("=== Hulisani To-Do List App ===");

        do {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter task: ");
                String task = scanner.nextLine();
                tasks.add(task);
                System.out.println("Task added!");
            } else if (choice == 2) {
                System.out.println("\n--- Your Tasks ---");
                if (tasks.isEmpty()) {
                    System.out.println("No tasks yet!");
                } else {
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                }
            } else if (choice == 3) {
                System.out.print("Enter task number to delete: ");
                int num = scanner.nextInt();
                if (num > 0 && num <= tasks.size()) {
                    tasks.remove(num - 1);
                    System.out.println("Task deleted!");
                } else {
                    System.out.println("Invalid number!");
                }
            }
        } while (choice != 4);

        System.out.println("Goodbye! Stay productive!");
        scanner.close();
    }
}