import java.util.Scanner;
public class cwh_21_do_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =0;
        while (a<5){
            System.out.println(a);
            a++;
        }
        System.out.println("------------------");
        System.out.println("Do while loop :");
        int b=0;
        do {
            System.out.println(b);
            b++;
        }
        while (b<10);
        System.out.println("Do while Loop ended :");

        System.out.println("------------------");
        System.out.println("Quick Quiz Solved  :");

        int c =1;
        do {
            System.out.println(c);
            c++;
        }while (c<=45);

        System.out.println("------------------");
        System.out.println("For User Input :");
        System.out.println("Enter Your Number  :");

        int num1= sc.nextInt();
        int d=1;
        do {
            System.out.println(d);
            d++;
        }while (d<=num1);
    }
}
