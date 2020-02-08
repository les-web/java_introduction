package inheritance.figure;

public class Square implements Figure {
    private double bok;

    public Square(double bok) {
        this.bok = bok;
    }

    @Override
    public double area() {
        return Math.pow(bok, 2.0);
    }

    @Override
    public String toString() {
        return "Square{" +
                " bok = " + bok +
                '}';
    }
}
