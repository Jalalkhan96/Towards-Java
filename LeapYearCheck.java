import java.util.Scanner;

// Check whether a year is a leap year.
// A year is a leap year if it is divisible by 400, or divisible by 4
// but not by 100. So 2000 and 2024 are leap years, 1900 and 2023 are not.

public class LeapYearCheck {
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is NOT a leap year.");
        }
        sc.close();
    }
}
