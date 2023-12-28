import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class cw_19_pct_2 {
    //Question two
    public static void main(String[] args) {
        //Answer 01
        Scanner sc = new Scanner(System.in);
        byte m1 , m2 , m3 ;

        System.out.println("Enter number of Subject Physics :");
        m1= sc.nextByte();
        System.out.println("Enter number of Subject Chemistry :");
        m2= sc.nextByte();
        System.out.println("Enter number of Subject Mathematics :");
        m3= sc.nextByte();
        float avg =(m1 + m2 + m3)/3.0f;
        System.out.println("The overall Percentage is "+avg);
        if (avg >40 && m1 >33 && m2 >33 && m3 >33){
            System.out.println("Congrate! You're Passed And Promoted");
        }
        else {
            System.out.println("Alas! You're Failed And not Promoted :");
        }
        //Answer 02
         int day;
        System.out.println("Enter Number from 1 t 7");
        day =sc.nextInt();
        switch (day){
            case 1-> System.out.println("Monday");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thursday");
            case 5-> System.out.println("Friday");
            case 6-> System.out.println("Saturday");
            case 7-> System.out.println("Sunday");
        }
    }
}
