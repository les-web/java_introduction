package classes.basics.exercise;

public class Point {

    private double x;
    private double y;

    // inmutable
    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }


    public static double distance (Point point1, Point point2) {
        return Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y,2));
    }

    public double distanceTo (Point other) {
    //    return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y,2));
        return distance (this, other);
    }

    public String toString() {
        return "Point(x: " + x + " y: "+ y + ")";
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

}
