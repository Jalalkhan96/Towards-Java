import java.util.Scanner;
public class cwh_25_every_table {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("Table :");
        System.out.println("Enter Number whose table you want :");
        int num = sc.nextInt();
        System.out.println("Where is the end of table :");
        int num2 = sc.nextInt();
        for (int i=1; i<=num2; i++){
            System.out.printf("%d x %d = %d\n",num,i, num*i);

        }
        System.out.println("-------------------------------");
    }
}

