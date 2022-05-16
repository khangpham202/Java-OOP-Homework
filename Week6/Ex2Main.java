public class Ex2Main {
    public static void main(String[] args) {
        double[] arr = new double[] { 1, 2, 3 };
        double[] arr2 = new double[] { 4, 5, 6 };
        Ex2 x = new Ex2(arr, arr.length);
        Ex2 y = new Ex2(arr2, arr2.length);
        Ex2 z = new Ex2(arr, arr.length);
        z.cong(x, y, z);
        Ex2 u = new Ex2(arr, arr.length);
        u.tru(x, y, u);
        Ex2 t = new Ex2(arr, arr.length);
        Ex2 k = new Ex2(arr, arr.length);

        System.out.println("Vector thu nhat la : " + x.toString());
        System.out.println("Vector thu hai la : " + y.toString());
        System.out.println("********************");
        System.out.println("Do dai vector thu nhat la: " + String.format("%.2f", x.dodai()));
        System.out.println("Phep cong 2 vector: " + z.toString());
        System.out.println("Phep tru 2 vector: " + u.toString());
        System.out.println("Nhan vector thu hai voi so 2: " + t.nhan(y, 2).toString());
        System.out.println("Vector don vi cua vector thu nhat: " + k.vtdonvi(x).toString());
    }
}
