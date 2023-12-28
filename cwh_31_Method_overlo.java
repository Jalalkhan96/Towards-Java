public class cwh_31_Method_overlo {
    static void foo(){
        System.out.println("Good Morning Bro :");
    }
    static void foo(int a){
        System.out.println("Good Morning "+a+ "Bro!!");
    }
    static void foo(int a, int b){
        System.out.println("Good Morning " + a +" Bro!!!");
        System.out.println("Good Evening " + b +" Bro!!!");
    }
    public static void main(String[] args) {

        System.out.println("----------------------------");
        foo();
        System.out.println("----------------------------");
        foo(33);
        System.out.println("----------------------------");
        foo(45,67);
    }
}
