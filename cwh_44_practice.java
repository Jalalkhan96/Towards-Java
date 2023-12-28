import java.awt.*;

class Cylinder {

    private int Radius;
    private int height;

    public Cylinder(int radius, int height) {
        Radius = radius;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return Radius;
    }

    public void setRadius(int radius) {
        Radius = radius;
    }

    public double SurfaceArea() {
        return 2 * Math.PI * Radius * Radius + 2 * Math.PI * Radius * height;
    }

    public double volume() {
        return Math.PI * Radius * Radius * height;
    }
}
    class Rectangle {
        private int length;
        private int breath;

        public Rectangle() {
            this.length = 4;
            this.breath = 5;
        }

        public Rectangle(int length, int breath) {
            this.length = length;
            this.breath = breath;
        }

        public int getLength() {
            return length;
        }



        public int getBreath() {
            return breath;
        }


    }
    public class cwh_44_practice {
    public static void main(String[] args) {
//        problem no 1:
        Cylinder mycylinder= new Cylinder(3,4);
       // mycylinder.setHeight(3);
        //mycylinder.setRadius(4);

        int h = mycylinder.getHeight()* mycylinder.getRadius();
        System.out.println(h);
        System.out.println();
        System.out.println(mycylinder.SurfaceArea());
        System.out.println();
        System.out.println(mycylinder.volume());

        Rectangle r= new Rectangle();

        System.out.println(r.getLength());
        System.out.println(r.getBreath());
    }
}
