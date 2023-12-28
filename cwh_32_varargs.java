public class cwh_32_varargs {
    static  int sum (int x , int...arr){
        int result=x;
        for (int a : arr){
            result +=a;

        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Sum Using Varargs :");
        System.out.printf("The sum of 2 ,3 and 5 is: %d \n",sum(2,3,5));
        System.out.printf("The sum of 22,39and 55is: %d \n",sum(22,39,55));
        System.out.printf("The sum of 23,35and 58is: %d \n",sum(23,35,58));
        System.out.println("-------------------");

    }
}
