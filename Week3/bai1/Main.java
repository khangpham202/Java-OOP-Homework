import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String args[]) {
        System.out.print("------Nhan 1 hoac 2 de lua chon chuong trinh bai 2 hoac bai 3-----\n");
        System.out.print(" 1, Chuong trinh bai 2\n");
        System.out.print(" 2, Chuong trinh bai 3\n");

        Scanner sc = new Scanner(System.in);
        char option = sc.next().charAt(0);
        if (option == '1') {
            Point a = new Point();
            a.set("a");
            Point b = new Point();
            b.set("b");
            Point c = new Point();
            c.set("c");
            System.out.print("Toa do cua diem a la: ");
            a.show();
            System.out.print("Toa do cua diem b la: ");
            b.show();
            System.out.print("Toa do cua diem c la: ");
            c.show();
            a.LineThrough2Points(b);
            if (a.isCollinear(b, c) == true) {
                System.out.println("Ba diem thang hang");
            } else {
                System.out.println("Ba diem khong thang hang");
            }

            double p = (a.distance(b) + a.distance(c) + b.distance(c)) / 2;
            double s = Math.sqrt(p * (p - c.distance(a)) * (p - a.distance(b)) * (p -
                    c.distance(b)));
            if (a.isCollinear(b, c) == false) {
                System.out.printf("Dien tich tam giac la: %.2f", s);
            }

        }
        if (option == '2') {
            Point3d a = new Point3d();
            a.set("a");
            Point3d b = new Point3d();
            b.set("b");
            Point3d c = new Point3d();
            c.set("c");
            Point3d d = new Point3d();
            d.set("d");
            System.out.print("Toa do cua diem a la: ");
            a.show();
            System.out.print("Toa do cua diem b la: ");
            b.show();
            System.out.print("Toa do cua diem c la: ");
            c.show();
            System.out.print("Toa do cua diem d la: ");
            d.show();
            a.LineThrough3Points(b, c);
            if (Point3d.checkPlane(a, b, c, d) == true) {
                System.out.println("Diem d thuoc mat phang !!");
            } else
                System.out.println("Diem d khong thuoc mat phang !!");

        }
    }
}