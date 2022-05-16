public class Main {
    public static void main(String[] args) {
        Complex c = new Complex(2, 1);
        Complex d = new Complex(3, -4);
        System.out.println(d.toString());
        // System.out.println(c.Conjugate());
        // System.out.println("Real part of " + c + " is: " + c.getReal());
        // System.out.println(c + " + " + d + " = " + c.add(d));
        // System.out.println(c + " + " + d + " = " + Complex.add(c, d));
        // System.out.println(c + " * " + d + " = " + c.multiply(d));
        System.out.println(Complex.divide(c, d));
    }
}
