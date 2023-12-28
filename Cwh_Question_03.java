import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;
public class Cwh_Question_03 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Physics Subject Number :");
        int Physics= scan.nextInt();

        System.out.println("Enter English Subject Number :");
        int English= scan.nextInt();

        System.out.println("Enter Chemistry Subject Number :");
        int Chemistry= scan.nextInt();

        System.out.println("Enter Biology Subject Number :");
        int Biology= scan.nextInt();

      float Total= (((Physics + English + Chemistry + Biology)/400.0f)*100);
        System.out.println(Total);


//        float a= 56/7*50/5;
//        System.out.println(a);

}
}