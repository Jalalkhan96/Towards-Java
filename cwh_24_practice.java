import java.util.Scanner;
public class cwh_24_practice {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("---------------");
        System.out.println("For loop star printing :");
       int n =4;
        for (int i=n;i>0;i--){
            for (int j=0; j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("sum of first Five Even number :");
        int v=5;
        int sum=0;
        for (int i =0; i<n; i++){
            sum = sum + (2*i);

        }
        System.out.print("The sum of first five even number is :");
        System.out.println(sum);
        System.out.println("-------------");
        int e=5;
        int sum1=0;
        for (int i =0; i<n; i++){
            sum1 = sum1 + (2*i+1);

        }
        System.out.print("THe sum of first five odd number is :");

        System.out.println(sum1);
        System.out.println("---------------------");
        System.out.println("Table :");
        System.out.println("Enter Number whose table you want :");
        int num = sc.nextInt();
        System.out.println("Enter number where is the end of table :");
        int num2 = sc.nextInt();
        for (int i=1; i<=num2; i++){
            System.out.printf("%d x %d = %d\n",num,i, num*i);

        }
        System.out.println("-------------------------------");
        System.out.println("Reverse Table :");

        int g =10;
        for (int i =10; i>=1;i--){
            System.out.printf("%d X %d=%d\n",g,i,g*i);
        }
        System.out.println(" for factorial :");
        System.out.println("-------------------------------");
        int o= 5;
        int y = 1;
        int factorial =1;
        while (y<=o){
           // factorial*=y;
            factorial*=y;
            y++;
        }
        System.out.println(factorial);
 int t =7;
 int yy =1;
 int factorial1 =1;
 while (yy<t){
     factorial1*=yy;
     yy++;
 }
 System.out.println(factorial1);
 System.out.println("---------------------");
 System.out.printf("Enter which table you needed :");
   int uu =sc.nextInt();
   int sum2=0;
   for (int i =1; i<=10;i++){
       sum2 += uu*i;
   }
        System.out.printf("The sum of %d table is :",uu);
        System.out.println(sum2);
    }
}
