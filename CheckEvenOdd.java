import java.util.Scanner;

// Check whether a number is even or odd.
// A number is even if it is divisible by 2, otherwise it is odd.
// So 4 and 0 are even, 7 and -3 are odd.

public class CheckEvenOdd {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        sc.close();
    }
}
