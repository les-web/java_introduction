package inheritance.figure;

public class Triangle implements Figure {

    private double a, h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double area() {
        return 0.5 * a * h;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                " a= " + a +
                ", h= " + h +
                '}';
    }
}
