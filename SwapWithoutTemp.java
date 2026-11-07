public class SwapWithoutTemp {
    // Swap two numbers without a third (temporary) variable, using
    // arithmetic: a = a + b; b = a - b; a = a - b.
    // A second variant uses XOR, which also needs no extra variable.
    static int[] swapArithmetic(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[]{a, b};
    }

    static int[] swapXor(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        int[] swapped = swapArithmetic(a, b);
        System.out.println("After arithmetic swap: a = " + swapped[0] + ", b = " + swapped[1]);
        swapped = swapXor(a, b);
        System.out.println("After XOR swap: a = " + swapped[0] + ", b = " + swapped[1]);
        swapped = swapArithmetic(-3, 7);
        System.out.println("After arithmetic swap (-3, 7): a = " + swapped[0] + ", b = " + swapped[1]);
    }
}
