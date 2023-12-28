public class cwh_22_For_loop {
    public static void main(String[] args) {
        int n = 6;
        for (int i=0; i <= n ; i++){
            System.out.println(i);
        }
        System.out.println("-------------");
        System.out.println("Decrement");
        for (int i =100 ; i>=0 ; i--){
            System.out.println(i);
        }
        System.out.println("------------");
        System.out.println("Increment");

        for (int b= 0; b <= 100; b++){
            System.out.println(b);
        }
        System.out.println("------------");
        System.out.println("Odd Number In For Loop :");
        int d =8;
        for (int i = 0; i <d ; i++){
            System.out.println(2*i+1);
        }
        System.out.println("------------");
        System.out.println("Even  Number In For Loop :");
        int f = 12;
        for (int i=1;i<f; i++){
            System.out.println(2*i);
        }
    }
}
