import java.util.Scanner;
public class MainTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh 1: ");
        double s1 = scanner.nextDouble();
        System.out.print("Nhập cạnh 2: ");
        double s2 = scanner.nextDouble();
        System.out.print("Nhập cạnh 3: ");
        double s3 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhập màu sắc: ");
        String color = scanner.nextLine();
        System.out.print("Có tô màu không (true/false): ");
        boolean filled = scanner.nextBoolean();

        if (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1) {
            Triangle triangle = new Triangle(color, filled, s1, s2, s3);
            System.out.println("\nThông tin tam giác vừa tạo:");
            System.out.println(triangle);
        } else {
            System.out.println("Lỗi: Ba cạnh này không tạo thành một tam giác!");
        }
    }
}
