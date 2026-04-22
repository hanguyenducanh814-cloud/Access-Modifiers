public class MainPoint2DAndPoint3D {
    public static void main(String[] args) {
        Point2D p2 = new Point2D(1.5f, 2.5f);
        System.out.println("Point 2D: " + p2);

        Point3D p3 = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point 3D: " + p3);

        // Kiểm tra mảng trả về
        float[] coords = p3.getXYZ();
        System.out.printf("Tọa độ tách rời: x=%.1f, y=%.1f, z=%.1f", coords[0], coords[1], coords[2]);
    }
}