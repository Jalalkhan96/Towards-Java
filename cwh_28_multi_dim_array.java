//import java.util.Scanner;
public class cwh_28_multi_dim_array {
    public static void main(String[] args) {
        System.out.println("--------------------");
        //Scanner sc = new Scanner(System.in);
        int[] [] Flats= new int[3][5];

        /*for (int i = 0; i < Flats.length; i++) {
            for (int j = 0; j < Flats[i].length; j++) {
            System.out.print("Enter value for Flats[" + i + "][" + j + "]: ");
            Flats[i][j] = sc.nextInt();
            }
        }


        sc.close();

        for (int i = 0; i < Flats.length; i++) {
        for (int j = 0; j < Flats[i].length; j++) {
        System.out.print(Flats[i][j] + " ");
        }
        System.out.println();
        }
        */
        Flats[0][0]=101;
        Flats[0][1]=102;
        Flats[0][2]=103;
        Flats[0][3]=104;
        Flats[0][4]=105;
        Flats[1][0]=200;
        Flats[1][1]=201;
        Flats[1][2]=202;
        Flats[1][3]=203;
        Flats[1][4]=204;
        Flats[2][0]=301;
        Flats[2][1]=302;
        Flats[2][2]=303;
        Flats[2][3]=304;
        Flats[2][4]=305;
        for (int i = 0 ;i< Flats.length;i++){
            for (int j=0;j<Flats[i].length;j++){
                System.out.print(Flats[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }


}
