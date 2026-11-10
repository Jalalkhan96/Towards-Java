import java.util.Scanner;

// Find the largest of three numbers entered by the user,
// e.g. (5, 10, 3) -> 10 is the largest.

public class LargestOfThree {
    public static int largestOfThree(int a, int b, int c) {
        int largest = a;
        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.println("The largest number is: " + largestOfThree(a, b, c));
        sc.close();
    }
}
