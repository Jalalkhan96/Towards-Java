import  java.util.Scanner;
public class cwh_29_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Question 1");
        float[] marks= {45.3f,45.54f,89.56f,89.75f};
        System.out.print(marks.length);
        float sum=0;

        for ( float element :marks){
            sum += element;

        }
        System.out.print(sum);

        System.out.println("-----------------");
        System.out.println("Question 2 :");
        System.out.println( "Enter Number Which you Wanna find in Array :");
        int[] mark ={45,45,48,45,58,95};
        int number = sc.nextInt();
        boolean Isinarray=false;
        for (int element: mark) {
            if (number == element) {
                Isinarray = true;
                break;
            }
        }
            if (Isinarray){
                System.out.println("Element in the array:");
            }
            else {
                System.out.println("Element is not in array :");
            }
        System.out.println("-------------------");
        System.out.println("End Of Question 2 :");
        System.out.println();
        System.out.println("-------------------");
        System.out.println("Question 3 :");
        float[] arr = {87.55f, 46.44f, 89.23f, 65.23f, 26.65f, 45.36f, 78.85f, 25.85f, 62.12f, 48.87f};
        float sum1 = 0;

        for (float element : arr) {
            sum1 += element;
        }
        System.out.println("The Average is :"+sum1/ arr.length);
        System.out.println("-------------------");
        System.out.println("Question 4 :");

        int [] [] mat1= {{1,2,3,},
                          {4,5,6}};
        int [] [] mat2= {{6,7,8},
                          {5,8,7}};
        int [][] result= {{0,0,0},
                          {0,0,0}};
         for (int i =0 ;i< mat1.length;i++) {
             for (int j = 0; j < mat1[i].length; j++) {


                 result[i][j] = mat1[i][j] + mat2[i][j];
                 System.out.print(result[i][j] + " ");

//                 System.out.println("------------------");
//                  System.out.format("Setting value for i=%d and j=%d \n",i,j);
             }
             System.out.println();
         }


             System.out.println("----------------");
             System.out.println("Question 5 :");

             int[] rarr = {54, 4, 58, 78, 4, 5, 87, 98, 78};
             int l = rarr.length;
             int n = Math.floorDiv(l, 2);
             int temp;
             System.out.println("Array is : ");
             for (int element : rarr) {
                 System.out.print(element + " ");
             }
             System.out.println();
             System.out.println("the reverse is :");
             for (int i = 0; i < n; i++) {
                 temp = rarr[i];
                 rarr[i] = rarr[l - i - 1];
                 rarr[l - i - 1] = temp;
             }
             for (int element : rarr) {
                 System.out.print(element + " ");
             }

             System.out.println("-------------------");
             System.out.println("Question 6 :");
             int[] earr= {45,45,-77,78,-85,-7,-88,85,47,18};
             int max = Integer.MIN_VALUE;
             for(int ee: earr){
                 if (ee>max){
                     max=ee;
                 }
             }
             System.out.println("The value of maximium elemnent in array is :"+max );

        System.out.println("-------------------");
        System.out.println("Question 7:");
        System.out.println("For Minimum Value:");
        int [] warray= {-2100,-789,897,5663,-4566,6786,-99999,4567};
        int min = Integer.MAX_VALUE;

        for ( int ee : warray){
             if (ee<min){
                 min=ee;
             }
        }
        System.out.println("The value of minimum element in array is :"+min );
        System.out.println("--------------------");
        System.out.println("For Maximum Value:");
        int max2= Integer.MIN_VALUE;
        for (int ee : warray){
            if (ee>max2){
                max2=ee;
            }
        }
        System.out.println("The value of minimum element in array is :"+max2 );
        System.out.println("-------------------");
        System.out.println("Question 8:");
        boolean isSorted= true;
        int [] Garray= {-2100,-789,897,5663,-4566,6786,-99999,4567};
        for (int i =0; i<Garray.length-1;i++) {
            if (Garray[i] > Garray[i + 1]) {
                isSorted = false;
                break;
            }
        }
          if (isSorted){
              System.out.println("Array is sorted");
          }
          else {
              System.out.println("Array is Not sorted");
          }




    }
}
