public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle(3.0, "blue");

        System.out.println("Sebelum diubah:");
        System.out.println(c);

        c.setRadius(4.0);
        c.setColor("green");

        System.out.println("Setelah diubah:");
        System.out.println(c);
    }
}