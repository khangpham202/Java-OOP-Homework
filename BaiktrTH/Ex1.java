import java.util.Scanner;

public class Ex1 {
    private static Scanner scanner = new Scanner(System.in);

    // Tìm USCLN
    public static int USCLN(int a, int b) {
        if (b == 0)
            return a;
        return USCLN(b, a % b);
    }

    // Tìm BSCNN
    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }

    public static void main(String[] args) {
        System.out.print("Nhap so nguyen duong a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap so nguyen duong b: ");
        int b = scanner.nextInt();
        // tính USCLN của a và b
        System.out.println("USCLN cua " + a + " và " + b
                + " la: " + USCLN(a, b));
        // tính BSCNN của a và b
        System.out.println("BSCNN cua " + a + " và " + b
                + " la: " + BSCNN(a, b));
    }

}
