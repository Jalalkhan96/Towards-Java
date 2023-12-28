import java.sql.SQLOutput;

class Sphere {
    private int Radius;

    public Sphere() {
        this.Radius = 3;
    }

    public Sphere(int radius) {
       this.Radius = radius;
    }

    public int getRadius() {
        return Radius;
    }
   public double surfaceArea(){
        return 4*Math.PI*Radius*Radius;
   }
   public double Volume(){
        return (4/3)*Math.PI*Radius*Radius*Radius;
   }

}
public class cwh_43_practice {
    public static void main(String[] args) {
        Sphere myradius= new Sphere();
        System.out.println("surface Area o sphere is :");
        System.out.println(myradius.surfaceArea());
        System.out.println("Volume  of Sphere is ");
        System.out.println(myradius.Volume());

    }
}
