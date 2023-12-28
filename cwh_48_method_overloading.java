class A{
   public int a;
   public int Jalal(){
       return 4;
   }
   public void math2(){
       System.out.println("I am method 2 of class A---:");
   }
}

class  B extends  A{
    @Override
    public void math2(){
        System.out.println("Method 3 of class B ");
    }
}
public class cwh_48_method_overloading {
    public static void main(String[] args) {
        A a = new A();
        a.math2();
        B b = new B();
        b.math2();
    }
}
