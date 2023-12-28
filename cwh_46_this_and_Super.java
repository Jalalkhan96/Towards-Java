

class Ekclass{
    int a;
    // with out this -----;

    /*
    Ekclass(int v){

        a=v;     //use for different varable;

    }
    public int returnone(){
        return 1;
    }

    public int getA() {
        return a;
    }
    */

    //THis use for same variable;-----;
Ekclass(int a){
    this.a=a;
}
public int returnone(){
    return 1;
}


 public int getA() {
        return a;
    }
}
class Doclass extends Ekclass{
    Doclass(int c){
        super(c);
        System.out.println("I Am Constructor :");
    }
}
public class cwh_46_this_and_Super {
    public static void main(String[] args) {
     Ekclass e= new Ekclass(56);
        System.out.println(e.getA());
        Doclass d =new Doclass(5);

    }
}
