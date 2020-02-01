/*
 class work on 2020-01-26
 java training
 Bydgoszcz
 Leszek Żebrowski
*/
package introduction;

public class SimpleTypes {

    public static void main(String[] args) {

        int age;
        age=0;
        System.out.println("Age equals  "+age+" years");

        long lottoReward = 32_000_000L;
        System.out.println("Lotto prize is "+lottoReward);

        short dayOfMonth = 29;
        System.out.println("Day of the month is " + dayOfMonth);
        dayOfMonth = 23;
        System.out.println("Day of the month changed is " + dayOfMonth);

        final float PI = 3.14F;
        System.out.println("In this module assumed constant value of pi as " + PI);

        double tax = 39_000.87D;
        System.out.println("Population of this country is " + tax + " USD");

        boolean isPaid = false;
        System.out.println("Tax is paid ? " + isPaid);
        isPaid = true;
        System.out.println("Tax is paid ? " + isPaid);

        String isPaidText = isPaid ? "Yes" : "No";
        System.out.println("Tax is paid ? " + isPaidText);

        String name = "Leszek";
        int index = 0;
        // char oneLetter = 's';
        char oneLetter = name.charAt(index);
        System.out.println((index +1) + " character in the name " + name + " is " + oneLetter);

        String prefix = "Le";
        boolean isStartingWith = name.startsWith(prefix);
        System.out.println("Does name " + name + " start with "+ prefix + "? : " + isStartingWith);

        // Homework 2020-01-29
        /*
        Zadania dotyczące typów danych.

        Zakresy
        Stwórz pod dwie zmienne wszystkich podstawowych typów liczbowych: int, long, short, float, double.
        Ustaw ich wartości na minimum i maksimum.
        Podpowiedzi jak to zrobić znajdują się w module type tego projektu (np. Integer.MIN_VALUE).
        Następnie zwiększ wartości maksymalne o 1. Wartości minimalne zmniejsz o 1.
        Jakie są nowe wartości tych zmiennych?
        */
        int intVar1, intVar2;
        intVar1 = Integer.MIN_VALUE;
        intVar2 = Integer.MAX_VALUE;
        System.out.println(" int MIN VALUE = " + intVar1);
        System.out.println(" int MAX VALUE = " + intVar2);
        intVar1 = intVar1 - 1;
        intVar2 = intVar2 + 1;
        System.out.println(" int MIN VALUE - 1 = " + intVar1);
        System.out.println(" int MAX VALUE + 1 = " + intVar2);

        long longVar1, longVar2;
        longVar1 = Long.MIN_VALUE;
        longVar2 = Long.MAX_VALUE;
        System.out.println(" long MIN VALUE = " + longVar1);
        System.out.println(" long MAX VALUE = " + longVar2);
        longVar1 = longVar1 - 1;
        longVar2 = longVar2 + 1;
        System.out.println(" long MIN VALUE - 1 = " + longVar1);
        System.out.println(" long MAX VALUE + 1 = " + longVar2);

        short shortVar1, shortVar2;
        shortVar1 = Short.MIN_VALUE;
        shortVar2 = Short.MAX_VALUE;
        System.out.println(" short MIN VALUE = " + shortVar1);
        System.out.println(" short MAX VALUE = " + shortVar2);
        shortVar1 = (short) (shortVar1 - 1);
        shortVar2 = (short) (shortVar2 + 1);
        System.out.println(" short MIN VALUE - 1 = " + shortVar1);
        System.out.println(" short MAX VALUE + 1 = " + shortVar2);

        float floatVar1, floatVar2;
        floatVar1 = Float.MIN_VALUE;
        floatVar2 = Float.MAX_VALUE;
        System.out.println(" float MIN VALUE = " + floatVar1);
        System.out.println(" float MAX VALUE = " + floatVar2);
        floatVar1 = floatVar1 - 1;
        floatVar2 = floatVar2 + 1;
        System.out.println(" float MIN VALUE - 1 = " + floatVar1);
        System.out.println(" float MAX VALUE + 1 = " + floatVar2);

        double doubleVar1, doubleVar2;
        doubleVar1 = Double.MIN_VALUE;
        doubleVar2 = Float.MAX_VALUE;
        System.out.println(" double MIN VALUE = " + doubleVar1);
        System.out.println(" double MAX VALUE = " + doubleVar2);
        doubleVar1 = doubleVar1 - 1;
        doubleVar2 = doubleVar2 + 1;
        System.out.println(" double MIN VALUE - 1 = " + doubleVar1);
        System.out.println(" double MAX VALUE + 1 = " + doubleVar2);





    }
}
