import java.util.Scanner;

// Find the sum of the first n natural numbers (1 + 2 + ... + n), e.g.
// the sum of the first 5 natural numbers is 15, and the sum of the
// first 100 is 5050. Uses the formula n * (n + 1) / 2.

public class SumOfNaturalNumbers {
    public static int sum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            System.out.println("Sum of first " + n + " natural numbers: " + sum(n));
        }
        sc.close();
    }
}
