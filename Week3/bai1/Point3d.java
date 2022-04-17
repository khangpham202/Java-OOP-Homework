import java.util.Scanner;
import java.util.Vector;

public class Point3d extends Point {
    public Point3d() {
    };

    private double z;

    public Point3d(double x, double y, double z) {
        super();
        this.z = z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    @Override
    public void set(String name) {
        super.set(name);
        System.out.printf("Nhap vao toa do z cua diem %s:", name);
        z = sc.nextDouble();
    }

    @Override
    public void show() {
        super.show();
        System.out.printf(", %.1f)", z);
        System.out.println();
    }

    public void LineThrough3Points(Point3d a, Point3d b) {
        Vector<Double> vt1 = new Vector<>();
        vt1.add((double) (a.getX() - this.getX()));
        vt1.add((double) (a.getY() - this.getY()));
        vt1.add((double) (a.getZ() - this.getZ()));
        Vector<Double> vt2 = new Vector<>();
        vt2.add((double) (b.getX() - this.getX()));
        vt2.add((double) (b.getY() - this.getY()));
        vt2.add((double) (b.getZ() - this.getZ()));
        Vector<Double> vtpt = new Vector<>();
        double x = (vt1.get(1) * vt2.get(2)) - (vt1.get(2) * vt2.get(1));
        double y = (vt1.get(2) * vt2.get(0)) - (vt1.get(0) * vt2.get(2));
        double z = (vt1.get(0) * vt2.get(1)) - (vt1.get(1) * vt2.get(0));
        vtpt.add(x);
        vtpt.add(z);
        vtpt.add(y);
        double c = (vtpt.get(0) * (-this.getX())) + (vtpt.get(1) * (-this.getY())) + (vtpt.get(2) * (-this.getZ()));
        System.out.println("Phuong trinh mat phang di qua 3 diem la: " + x +
                "x + " + y + "y + " + z +
                "z + " + c + " = 0.");
    }
}
