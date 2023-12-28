interface sampleInterface{
   void math1();
   void math2();
}
interface childSampleInterface extends sampleInterface{
    void math3();
    void math4();
}
class Mysample implements childSampleInterface{
    @Override
    public void math1() {
        System.out.println("MATH 1 Run --->:");
    }
    public void math2() {
        System.out.println("MATH 2 Run --->:");
    }
    public void math3() {
        System.out.println("MATH 3 Run --->:");
    }
    public void math4() {
        System.out.println("MATH 4 Run --->:");
    }



}

public class cwh_58_Inhertance_interferance {
    public static void main(String[] args) {
        Mysample OBJ=new Mysample();
        OBJ.math1();
        OBJ.math2();
        OBJ.math3();
        OBJ.math4();
    }
}
