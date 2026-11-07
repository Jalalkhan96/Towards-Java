public class ArmstrongNumber {
    // An Armstrong number equals the sum of its own digits each raised
    // to the power of the number of digits, e.g. 153 = 1^3 + 5^3 + 3^3
    // and 9474 = 9^4 + 4^4 + 7^4 + 4^4.
    static boolean isArmstrong(int n) {
        if (n < 0) {
            return false;
        }
        int digits = String.valueOf(n).length();
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int d = temp % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= d;
            }
            sum += power;
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int[] demo = {0, 153, 370, 123, 9474, 9475};
        for (int n : demo) {
            System.out.println(n + (isArmstrong(n) ? " is an Armstrong number" : " is not an Armstrong number"));
        }
    }
}
