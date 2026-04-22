public class Cylinder extends Rectangle {
    private double height = 1.0;

    public Cylinder() {}

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public double getVolume() {
        return super.getArea() * height;
    }

    public String toString() {
        return "A Cylinder with height=" + height
                + ", which is a subclass of " + super.toString();
    }
}