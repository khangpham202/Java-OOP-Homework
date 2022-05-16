public class Ex2 {
    protected int n;
    protected double[] mang = new double[n];

    public Ex2() {

    }

    public Ex2(int n) {
        this.n = n;
    }

    public Ex2(double[] mang, int n) {
        this.mang = mang;
        this.n = n;
    }

    public double dodai() {
        double x = 0;
        for (int i = 0; i < n; i++) {
            x += mang[i] * mang[i];
        }
        return Math.sqrt(x);
    }

    public Ex2 cong(Ex2 x, Ex2 y, Ex2 z) {
        for (int i = 0; i < n; i++) {
            z.mang[i] = x.mang[i] + y.mang[i];
        }
        return z;
    }

    public Ex2 tru(Ex2 x, Ex2 y, Ex2 z) {
        for (int i = 0; i < n; i++) {
            z.mang[i] = x.mang[i] - y.mang[i];
        }
        return z;
    }

    public Ex2 nhan(Ex2 x, int m) {
        for (int i = 0; i < n; i++) {
            x.mang[i] = x.mang[i] * m;
        }
        return x;
    }

    public Ex2 chia(Ex2 x, double m) {
        for (int i = 0; i < n; i++) {
            x.mang[i] = x.mang[i] / m;
        }
        return x;
    }

    public Ex2 vtdonvi(Ex2 x) {
        return x.chia(x, x.dodai());
    }

    public String toString() {
        String s = "( ";
        for (int i = 0; i < n; i++) {
            s += Double.toString(mang[i]) + " ";
        }
        s += ")";
        return s;
    }

    public void display() {
        System.out.print("Vector: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mang[i] + " ");
        }
    }
}
