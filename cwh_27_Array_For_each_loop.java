public class cwh_27_Array_For_each_loop {
    public static void main(String[] args) {
        System.out.println("---------------");
        int[]marks  = {45,45,89,65,78,44,45};
        System.out.print("Element In Array is :");
        System.out.println(marks.length);
        System.out.println("All Element of Array using Enhanced for loop :");
        System.out.println("-------------------------------------");
        for (int mark:marks){
            System.out.println(mark);
        }
        System.out.println("All Element of Array using for loop :");
        System.out.println("-------------------------------------");
        for (int i =0;i<marks.length;i++) {
            System.out.println(marks[i]);
        }
        System.out.println("All Element of Array in Reverse order using for loop :");
        System.out.println("-------------------------------------");
        for (int i= marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
        System.out.println("All Element of Array using for-each loop :");
        System.out.println("-------------------------------------");
        for (int element: marks){
            System.out.println(element);
        }
        System.out.println("-------------------------------------");
    }
}
