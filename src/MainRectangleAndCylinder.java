public class MainRectangleAndCylinder {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.5, "blue");
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());

        Cylinder cylinder = new Cylinder(3.5, "yellow", 5.0);
        System.out.println(cylinder);
        System.out.println("Volume: " + cylinder.getVolume());
    }
}