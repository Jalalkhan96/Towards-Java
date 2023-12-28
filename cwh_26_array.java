public class cwh_26_array {
    public static void main(String[] args) {
        System.out.println("Array in java :");
        System.out.println("Simple Way :");
        int [] marks= new int [5];;
        marks [0]=98;
        marks [1]=92;
        marks [2]=93;
        marks [3]=94;
        marks [4]=96;
        System.out.println(marks[4]);
        System.out.println("---------------------");
        System.out.println("2nd Method :");
       int[ ] Marks;
       Marks= new int[7];
       Marks[0]=67;
       Marks[1]=56;
       Marks[2]=78;
       Marks[3]=90;
       Marks[4]=43;
       Marks[5]=99;
       Marks[6]=34;
        System.out.println(Marks[0]);
        System.out.println(Marks[3]);
        System.out.println(Marks[6]);
        System.out.println("--------------------");
        System.out.println("3rd Method :");

        int[] MARKS= {78,78,89,78,45,45,45} ;
        System.out.println(MARKS[3]);
        System.out.println(MARKS[0]);
        System.out.println(MARKS[5]);
        System.out.println(MARKS[6]);
        System.out.printf("Using for loop");
        for (int i=0; i<MARKS.length;i++){
            System.out.println(MARKS[i]);
        }
        System.out.println("Reverse Oder :");
        for (int i = MARKS.length-1;i>=0;i--){
            System.out.println(MARKS[i]);
        }
    }
}
