
class Complex {
    /** Phần thực */
    private double r;
    /** Phần ảo */
    private double i;

    /** Construct a Complex */
    Complex(double rr, double ii) {
        r = rr;
        i = ii;
    }

    public String toString(){
        if(r == 0)
            return (Double.toString(i) +"i");
        else if(i == 0)
            return (Double.toString(r));
        else 
            return (Double.toString(r) + " + " + Double.toString(i) + "i");
    }


    /** Return just the Real part */
    public double getReal() {
        return r;
    }

    /** Return just the Real part */
    public double getImaginary() {
        return i;
    }

    /** Tính modun */
    public double magnitude() {
        return Math.sqrt(r * r + i * i);
    }

   

    /**
     * Add two Complexes
     */
    public static Complex add(Complex c1, Complex c2) {
        return new Complex(c1.r + c2.r, c1.i + c2.i);
    }

   

    /**
     * Subtract two Complexes
     */
    public static Complex subtract(Complex c1, Complex c2) {
        return new Complex(c1.r - c2.r, c1.i - c2.i);
    }

    /**
     * Multiply two Complexes
     */
    public static Complex multiply(Complex c1, Complex c2) {
        return new Complex(c1.r * c2.r - c1.i * c2.i, c1.r * c2.i + c1.i * c2.r);
    }
     /**
     * Multiply a complex number by a real number
     */
    public Complex multiplyByRnumBer(double c){
        return new Complex(r *c, i *c);
    }
    /**
     * Divide c1 by c2.
     */
    public static Complex divide(Complex c1, Complex c2) {
        return new Complex(
                (c1.r * c2.r + c1.i * c2.i) / (c2.r * c2.r + c2.i * c2.i),
                (c1.i * c2.r - c1.r * c2.i) / (c2.r * c2.r + c2.i * c2.i));
    }

    /*
     * So sánh 2 số phức
     */
    public boolean equals(Object o) {
        if (!(o instanceof Complex))
            throw new IllegalArgumentException(
                    "Complex.equals argument must be a Complex");
        Complex other = (Complex) o;
        return r == other.r && i == other.i;
    }

    /*
     * trả về số phức liên hợp
     */
    public Complex Conjugate() {
        return new Complex(this.r, -(this.i));
    }

}