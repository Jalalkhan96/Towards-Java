import java.util.Scanner;
public class Cwh_16_if_else {
    public static void main(String[] args) {
        //For User Input:
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Your Age :");
        int age= scanner.nextInt();


        if (age >= 18 && age <= 90){
            System.out.println("You are allowed to drive :");
        }
        else {
            System.out.println("Can't allowed to drive :");
        }
        //second part:
        System.out.println("Second condition :");
        int age1= scanner.nextInt();
        if (age1 <= 90){
            System.out.println("You are allowed to drive :");
        }
        else {
            System.out.println("Can't allowed to drive :");
        }



        //For general:
        int age12 =18;
        boolean cond = (age12==18);
        System.out.println("For General :");

        if (cond){
            System.out.println("You are allowed to drive :");
        }
        else {
            System.out.println("Can't allowed to drive :");
        }


    }
}
