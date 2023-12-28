public class cwh_33_recursion {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }
    static int factoiral_iterative(int n){
        if (n==0||n==1){
            return 1;
        }
        else {
            int Product=1;
            for (int i =1; i<=n;i++ ){
                Product*=i;
            }
            return Product;
        }

    }

    public static void main(String[] args) {
        int x = 4;
        System.out.println("the of factorial of 4 is :" + factorial(4));
        System.out.println("the of factorial of 5 is :" + factoiral_iterative(5));

    }
}
