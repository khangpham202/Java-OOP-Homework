
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        int am;
        int am1;
        Sender r = new Sender(20010904, "Khang", 2000);
        System.out.println("----- Thong tin tai khoan -----");
        r.display();
        System.out.print("==>Nhap so tien muon gui vao tai khoan: ");
        Scanner sc = new Scanner(System.in);
        am = sc.nextInt();
        r.deposit(am);
        System.out.println("----- Thong tin tai khoan sau khi gui tien -----");
        r.display();
        Receiver t = new Receiver(20010904, "Khang", r.getBalance());
        System.out.print("==>Nhap so tien muon rut khoi tai khoan: ");
        am1 = sc.nextInt();
        t.withdraw(am1);
        System.out.println("----- Thong tin tai khoan sau khi rut tien -----");
        t.display();
    }
}
