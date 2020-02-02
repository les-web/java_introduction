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

    void printStats () {
        // wypisz najmniejszy, najwiekszy i sredni dystans miedzy punktami
        // nie porównuj punktu samego ze sobą  (if point1 != point)
        double distanceMax = 0.0D;
        double distanceMin = Double.MAX_VALUE;

        for (int i = 0; i < pointNumber; i++) {
            for (int j = 0; j < pointNumber ; j++) {
                if (points[i] != points[j] ) {
                    if (points[i].distanceTo(points[j]) > distanceMax) {
                        distanceMax = points[i].distanceTo(points[j]);
                    }

                }

            }
        }
        System.out.println("Max = " + distanceMax);
        for (int i = 0; i < pointNumber; i++) {
            for (int j = 0; j < pointNumber ; j++) {
                if (points[i] != points[j] ) {
                    if (points[i].distanceTo(points[j]) < distanceMin) {
                        distanceMin = points[i].distanceTo(points[j]);
                    }

                }

            }
        }
        System.out.println("Min = " + distanceMin);
    }
}
