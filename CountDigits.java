import java.util.Scanner;

// Count the digits in a number. The sign is ignored, so -987 has 3 digits
// and 0 has 1 digit.

public class CountDigits {
    public static int countDigits(long number) {
        long n = Math.abs(number);
        if (n == 0) {
            return 1;
        }
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        System.out.println("Number of digits in " + number + " = " + countDigits(number));
        sc.close();
    }
}
