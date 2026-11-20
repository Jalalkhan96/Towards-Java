public class AreaOfRectangle {
    // Area of a rectangle = length * width
    // Perimeter of a rectangle = 2 * (length + width).
    static double area(double length, double width) {
        return length * width;
    }

    static double perimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        double length = 5, width = 3;
        System.out.println("Length: " + length + ", Width: " + width);
        System.out.println("Area: " + area(length, width));
        System.out.println("Perimeter: " + perimeter(length, width));
        System.out.println("Area of 10 x 4 rectangle: " + area(10, 4));
        System.out.println("Perimeter of 10 x 4 rectangle: " + perimeter(10, 4));
    }
}
