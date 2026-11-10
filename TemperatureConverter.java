import java.util.Scanner;

// Convert temperatures between Celsius and Fahrenheit.
// Celsius to Fahrenheit: F = C * 9/5 + 32
// Fahrenheit to Celsius: C = (F - 32) * 5/9
// e.g. 100 C = 212 F, 32 F = 0 C, 37 C = 98.6 F.

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option (1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();
            System.out.println(celsius + " C = " + celsiusToFahrenheit(celsius) + " F");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            System.out.println(fahrenheit + " F = " + fahrenheitToCelsius(fahrenheit) + " C");
        } else {
            System.out.println("Invalid option. Please choose 1 or 2.");
        }
        sc.close();
    }
}
