import java.util.Scanner;

// Reverse a string, e.g. "hello" becomes "olleh" and "Java" becomes
// "avaJ". The reversal builds a new string from the last character
// of the input to the first.

public class ReverseString {
    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Reversed: " + reverse(str));
        sc.close();
    }
}
