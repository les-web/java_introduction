package inheritance.figure;

public class Test {

    public static void main(String[] args) {

        Figure[] figures = new Figure[]{
                new Circle(4.5),
                new Square(5.6D),
                new Triangle(33.5, 5.6),
                new Circle(2.4D),
                new Circle((7.8))
        };
        double sumArea = 0.0D;
        for (Figure figure :
                figures) {
            sumArea = sumArea + figure.area();
            System.out.println("Figura " + figure + " ma powierzchnie " + figure.area());

        }
        System.out.println("Suma powierzchni wynosi " + sumArea);

    }
}
