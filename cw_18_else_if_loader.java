import java.util.Scanner;
public class cw_18_else_if_loader {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your Correct Age :");
        Scanner scanner =new Scanner(System.in);
        age=scanner.nextInt();
        switch (age){
            case 18:
                System.out.println("You're are going to be Adult! :");
                break;
            case 23:
                System.out.println("You're are Ready to grt a job :");
                break;
            case 45:
                System.out.println("You're at the best stage of life:");
                break;
                case 55:
                System.out.println("You're on The best level and earning stage of life :");
                break;
            case 60:
                System.out.println("You're going to retired from job : :");
                break;
                default:
                System.out.println("Enjoy your life");
                break;

        }

        if (age >= 56){
            System.out.println( "You're Experienced" );
        } else if (age > 45) {
            System.out.println("You're Semi Experienced");
        } else if (age > 35) {
            System.out.println("You're Semi-Semi Experienced");
        } else if (age > 29) {
            System.out.println("You're Less Experienced");
        }
        else {
            System.out.println("You're Not Experienced");
        }
    }
}
