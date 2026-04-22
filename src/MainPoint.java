public class MainPoint {
    public static void main(String[] args) {
        MoveblePoint mp = new MoveblePoint(10, 10, 2, 5);
        System.out.println("Vị trí ban đầu: " + mp);

        mp.move();
        System.out.println("Sau 1 lần di chuyển: " + mp);

        mp.move().move();
        System.out.println("Sau thêm 2 lần di chuyển: " + mp);
    }
}