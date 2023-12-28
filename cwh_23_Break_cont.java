import org.w3c.dom.ls.LSOutput;

public class cwh_23_Break_cont{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("Java By Jalal");
            if (i == 4) {
                System.out.println("Ending the Loop :");
                break;
            }

        }
        System.out.println("------------");


        System.out.println("While Loop :");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            System.out.println("Java By Jalal");
            if (i == 2) {
                System.out.println("Ending the Loop :");
                break;
            }
            i++;
        }
        System.out.println("While loop ended :");
        System.out.println("----------");
        System.out.println();
        System.out.println("Do while loop :");
        int b =0;
        do {
            System.out.println(b);
            System.out.println("Java By Jalal");
            if (b == 2) {
                System.out.println("Ending the Loop :");
                break;
            }
            b++;

        }while (b < 5) ;
        System.out.println("For continuous :");

        for (int c= 0; c<5;c++){
            if (c==2) {
                System.out.println(c);
                System.out.println("Odd Number :");
                continue;
            }
            System.out.println(c);
            System.out.println("Even Number");

        }
        System.out.println("----------------");
        System.out.println("For Loop :");

         //Do while Loop
        int d = 1;
        do {
            d++;
            if (d == 3) {
                System.out.println(d);
                System.out.println("Not Return Answer :");
                continue;
            }
            System.out.println(d);
            System.out.println("Return Answer :");

        }while (d<5);
    System.out.println("loop end here :");
    System.out.println("----------------");

    }






}
