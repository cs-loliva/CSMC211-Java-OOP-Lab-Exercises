import java.util.Scanner;

public class Oliva4 {
    public static void main(String[] args) {
        // Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Smart Device Simulation ===");

        System.out.print("Enter the name of the smart device: ");
        String name = scanner.nextLine();

        // SmartDevice object
        SmartDevice dev1 = new SmartLight(name);

        int choice = 0;

        do {
            System.out.println("\nChoose an action:");
            System.out.println("1. Power ON/OFF the device");
            System.out.println("2. Adjust brightness");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    /*Code for command 1*/
                case 2:
                    /*Code for command 2*/
			/*Clue: Look up "Pattern Matching" in Java Polymorphism*/
                case 3:
                    break;
                default:
                    /*Code for invalid commands*/
            }
        } while (choice != 3);

        scanner.close();
    }
}

