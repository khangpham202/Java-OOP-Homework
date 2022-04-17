import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String args[]) {
        Point3d a = new Point3d();
        a.set("a");
        Point3d b = new Point3d();
        b.set("b");
        Point3d c = new Point3d();
        c.set("c");

        // Point a = new Point();
        // a.set("a");
        // Point b = new Point();
        // b.set("b");
        // Point c = new Point();
        // c.set("c");
        System.out.print("Toa do cua diem a la: ");
        a.show();
        System.out.print("Toa do cua diem b la: ");
        b.show();
        System.out.print("Toa do cua diem c la: ");
        c.show();
        // if (a.isCollinear(b, c) == true) {
        // System.out.println("c) Ba diem thang hang");
        // } else {
        // System.out.println("c) Ba diem khong thang hang");
        // }
        // System.out.print("d) Chon 2 diem muon tinh khoang cach:\n");
        // System.out.print(" 1, Nhap 1 de tinh khoang cach hai diem a va b\n");
        // System.out.print(" 2, Nhap 2 de tinh khoang cach hai diem b va c\n");
        // System.out.print(" 3, Nhap 3 de tinh khoang cach hai diem a va c\n");
        // Scanner sc = new Scanner(System.in);
        // char option = sc.next().charAt(0);
        // if (option == '1') {
        // System.out.printf("=>> Khoang cach giua diem a va b la %.2f\n",
        // a.distance(b));

        // }
        // if (option == '2') {
        // System.out.printf("=>> Khoang cach giua diem b va c la %.2f\n",
        // b.distance(c));

        // }
        // if (option == '3') {
        // System.out.printf("=>> Khoang cach giua diem a va c la %.2f\n",
        // a.distance(c));

        // }

        // Triangle abc = new Triangle(a, b, c);
        // System.out.printf("e) Dien tich va chu vi cua tam giac lan luot la: %.2f,
        // %.2f", abc.Area(), abc.Perimeter());

        // a.LineThrough2Points(b);
        a.LineThrough3Points(b, c);
    }
}