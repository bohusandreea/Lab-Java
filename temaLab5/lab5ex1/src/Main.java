import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti numarul de angajati: ");
        int numberOfEmployees = scanner.nextInt();

        ArrayList<Employee> employees = new ArrayList<>();

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Introduceti datele pentru angajatul " + (i + 1) + ":");
            System.out.print("Nume: ");
            String name = scanner.next();

            System.out.print("Email: ");
            String email = scanner.next();

            System.out.print("Plata pe ora: ");
            double hourRate = scanner.nextDouble();

            System.out.print("Capacitatea de lucru (ore pe zi): ");
            int capacity = scanner.nextInt();

            System.out.print("Zile libere: ");
            int freeDays = scanner.nextInt();

            Employee employee = new Employee(name, email, hourRate, capacity, freeDays);
            employees.add(employee);
        }

        System.out.println("\nSalariul lunar pentru fiecare angajat:");

        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + employee.calculateMonthlyIncome());
        }

    }
}