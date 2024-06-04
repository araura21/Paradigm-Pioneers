package ec.edu.espe.ECMS.view;

import ec.edu.espe.ECMS.model.Computer;
import ec.edu.espe.ECMS.model.Customer;
import ec.edu.espe.ECMS.model.Rental;
import java.util.Scanner;

public class PPSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer information:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("ID: ");
        String id = scanner.nextLine();

        Customer customer = new Customer(name, lastName, address, phone, email, id);

        System.out.println("Enter computer information:");
        System.out.print("ID: ");
        int computerId = scanner.nextInt();
        scanner.nextLine(); // consume newline character
        System.out.print("Status: ");
        String status = scanner.nextLine();

        Computer computer = new Computer(computerId, status);

        System.out.print("Enter rental rate per hour: ");
        double rate = scanner.nextDouble();

        Rental rental = new Rental(1, customer, computer, rate);

        // Perform rental operations...

        scanner.close();
    }
}
