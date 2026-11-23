// Print star patterns: a right triangle, a pyramid and an inverted
// triangle, each with n rows. e.g. for n = 5 the pyramid is
//     *
//    ***
//   *****
//  *******
// *********

public class StarPattern {

    public static void printRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printInvertedTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Right triangle (n = " + n + "):");
        printRightTriangle(n);
        System.out.println("Pyramid (n = " + n + "):");
        printPyramid(n);
        System.out.println("Inverted triangle (n = " + n + "):");
        printInvertedTriangle(n);
    }
}
