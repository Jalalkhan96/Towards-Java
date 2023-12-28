public class cwh_30_methods {
    static int logic(int x, int y){
        int z;
        if (x>y){
            z=x+y;
        }
        else {
            z=(x+y)*5;
        }
        return z;
    }
    /*
    static int divide(int x,int y){
        int z;
        if (x<y){
            z=x%y;
        }
        else {
            z=y%x;
        }
        return z;
       }
       */


    public static void main(String[] args) {
        int a =6;
        int b =4;
        int c;
       // c= divide(a,b);
       c= logic(a,b);
        System.out.println("THhe value c is :"+c);
        System.out.println("-------------------");
        int a1 =5;
        int b1 =7;
        int c1;
        //c1=divide(a1,b1);
       c1= logic(a1,b1);
        System.out.println("THhe value c1 is :"+c1);
        System.out.println("-------------------");
    }
}
