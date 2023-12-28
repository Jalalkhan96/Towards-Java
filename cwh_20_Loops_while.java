import java.util.Scanner;
class cwh_20_Loops_while {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("With out while loop: ");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");

        System.out.println("----------------");

        System.out.println("Using while Loop :");
        System.out.println("Enter Number where loop end :");
        int num = sc.nextInt();
        System.out.println("While loop started");
        int i =1;
        while (i<=num){
            System.out.println(i);
            i++;
        }
        System.out.println(" While Loop Ended : ");
        System.out.println("-----------------");

        System.out.println("From 100 to Two Hundred :");
        int u= 100;
        while (u<=200){
            System.out.println(u);
            u++;
        }
        System.out.println("while loop ended :");
        System.out.println("-----------------");
    }
}
