public class MainEx1 {
    public static void main(String[] args) {
        Complex c = new Complex(2, 1);
        Complex d = new Complex(3, -4);
        System.out.println("So phuc c la: " + c.toString());
        System.out.println("So phuc d la: " + d.toString());
        System.out.println("************************");
        System.out.println("Modun cua so phuc c la : " + c.magnitude());
        System.out.println("So sanh hai so phuc c va d co ket qua : " + c.equals(d));
        System.out.println("Phep cong c va d co ket qua la: " + Complex.add(c, d));
        System.out.println("Phep tru c cho d co ket qua la: " + Complex.subtract(c, d));
        System.out.println("Phep nhan c va d co ket qua la: " + Complex.multiply(c, d));
        System.out.println("Phep chia c cho d co ket qua la: " + Complex.divide(c, d));
        System.out.println("Phep nhan so phuc c va so thuc 3 co ket qua la: " + c.multiplyByRnumBer(3));
        System.out.println("So phuc lien hop cua c la: " + c.Conjugate());
    }
}