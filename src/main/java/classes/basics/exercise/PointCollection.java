package classes.basics.exercise;

public class PointCollection {
    Point[] points = new Point[100];
    int pointNumber = 0;

    void addPoints (Point... points) {
        for (Point newPoint : points) {
            this.points[pointNumber] = newPoint;
            pointNumber++;


        }

    }
    void printAllPoints() {
        // wypisz wszystkie elementy tablicy od 0 do this. pointNumber -1
        for (int i = 0 ; i < pointNumber; i++) {
            printPoint(points[i]);
        }
    }

    void printPoint (Point point) {
       System.out.println("Point(x: "+point.getX() + " y: " + point.getY() + ")");
    }
}
