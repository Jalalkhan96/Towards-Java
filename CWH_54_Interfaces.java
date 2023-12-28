interface Bicycle{
    int a=96;
    void applyBreak(int decrement);
    void applySpeedUp(int increment);
}
interface HornBicycle{
    void blowKBY();
    void blowMHN();
}

class SoraabCycle implements Bicycle,HornBicycle{
    void blowHorn() {
        System.out.println("HEE HEE HEE :");
    }
    public void applyBreak(int decrement){
        System.out.println("Applying Break :");
    }
    public void applySpeedUp(int increment){
        System.out.println("Applying SpeedUp :");
    }
    public void  blowKBY(){
        System.out.println("KABHI------------>");
    }
    public void  blowMHN(){
        System.out.println("MAIN------------>");
    }

}

public class CWH_54_Interfaces {
    public static void main(String[] args) {
SoraabCycle CycleJalal=new SoraabCycle();
CycleJalal.applyBreak(23);
CycleJalal.applySpeedUp(60);
        System.out.println("The value of a is "+CycleJalal.a);
        CycleJalal.blowKBY();
        CycleJalal.blowMHN();


    }
}
