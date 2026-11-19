// Calculate base raised to the power of exponent using a loop.
// e.g. 2^10 = 1024, 5^0 = 1, 2^-3 = 0.125.

public class PowerCalculator {

    public static double power(double base, int exponent) {
        double result = 1.0;
        int steps = exponent < 0 ? -exponent : exponent;
        for (int i = 0; i < steps; i++) {
            result *= base;
        }
        if (exponent < 0) {
            result = 1.0 / result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("2^10 = " + power(2, 10));
        System.out.println("5^0 = " + power(5, 0));
        System.out.println("3^4 = " + power(3, 4));
        System.out.println("2^-3 = " + power(2, -3));
        System.out.println("10^5 = " + power(10, 5));
    }
}
