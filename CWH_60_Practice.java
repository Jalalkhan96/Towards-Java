abstract class Pen{
    abstract void write();
    abstract void Refill();

}
class PainoPen extends  Pen{
    public void write() {
        System.out.println("Write");
    }
    public void Refill(){
        System.out.println("Refill");
    }
    public void Nib(){
        System.out.println("Changing the Nib :");
    }
}
class Monkey{
    void jump(){
        System.out.println("JUMPING");
    }
    void bite(){
        System.out.println("BITING");
    }
}
interface BasicAnimal{
    void eat();
    void Sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("HELLO JALAL");
    }

    @Override
    public void Sleep() {
        System.out.println("Sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }
}


public class CWH_60_Practice {
    public static void main(String[] args) {
     PainoPen pen =new PainoPen();
     pen.Nib();
     Human Jalal =new Human();
     Jalal.speak();
     Jalal.Sleep();
     Jalal.eat();
     Monkey m1=new Human();
     m1.jump();
     m1.bite();
    }
}
