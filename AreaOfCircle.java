import java.util.Scanner;

// Find the area and circumference of a circle from its radius.
// Area = pi * r * r, Circumference = 2 * pi * r.

public class AreaOfCircle {
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        if (radius < 0) {
            System.out.println("Radius cannot be negative.");
        } else {
            System.out.println("Area = " + area(radius));
            System.out.println("Circumference = " + circumference(radius));
        }
        sc.close();
    }
}
