public class cwh_35_practice {
        static float temperature(float t) {
            return (t - 32) * 5 / 9;
        }

       static void pattern (int n){
            for (int i =0; i<n;i++){
                for (int j=0;j<i+1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
       }
    static void patternReverse(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
        public static void main(String[] args) {
            float te = 500.6f;
            System.out.println("The temperature in Celsius is: " + temperature(te));
        pattern(9);
            System.out.println("reverse is:");
        patternReverse(9);

        }





    }
