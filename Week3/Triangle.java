public class Triangle {
    private Point a;
    Point b;
    Point c;

    public Triangle() {
    };

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double Area() {
        double p = Perimeter() / 2;
        double area = 0;
        if (c.isCollinear(a, b) == false) {
            area = Math.sqrt(p * (p - c.distance(a)) * (p - a.distance(b)) * (p - c.distance(b)));
        }
        return area;
    }

    public double Perimeter() {
        double perimeter = 0;
        if (c.isCollinear(a, b) == false) {
            perimeter = a.distance(b) + a.distance(c) + b.distance(c);
        }
        return perimeter;
    }
}
