// GCD and LCM of two numbers (Euclid's algorithm).
// e.g. gcd(48, 18) = 6, lcm(48, 18) = 144
//      gcd(17, 5) = 1, lcm(17, 5) = 85

public class GcdLcm {

    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs(a / gcd(a, b) * b);
    }

    public static void main(String[] args) {
        int[][] pairs = {{48, 18}, {17, 5}, {0, 7}, {12, 12}};
        for (int[] pair : pairs) {
            int a = pair[0];
            int b = pair[1];
            System.out.println("gcd(" + a + ", " + b + ") = " + gcd(a, b)
                    + ", lcm(" + a + ", " + b + ") = " + lcm(a, b));
        }
    }
}
