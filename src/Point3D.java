public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {}

    public Point3D(float x, float y, float z) {
        super(x, y); // Gọi hàm tạo của lớp cha Point2D để gán x, y
        this.z = z;
    }

    public float getZ() { return z; }
    public void setZ(float z) { this.z = z; }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y); // Gọi phương thức của lớp cha
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), z}; // Kết hợp x, y từ cha và z của con
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
}