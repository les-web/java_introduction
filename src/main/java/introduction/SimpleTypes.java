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
        int varInt1, varInt2;
        varInt1 = Integer.MIN_VALUE;
        varInt2 = Integer.MAX_VALUE;
        System.out.println(" int MIN VALUE = " + varInt1);
        System.out.println(" int MAX VALUE = " + varInt2);
        varInt1 = varInt1 - 1;
        varInt2 = varInt2 + 1;
        System.out.println(" int MIN VALUE - 1 = " + varInt1);
        System.out.println(" int MAX VALUE + 1 = " + varInt2);

        long varLong1, varLong2;
        varLong1 = Long.MIN_VALUE;
        varLong2 = Long.MAX_VALUE;
        System.out.println(" long MIN VALUE = " + varLong1);
        System.out.println(" long MAX VALUE = " + varLong2);
        varLong1 = varLong1 - 1;
        varLong2 = varLong2 + 1;
        System.out.println(" long MIN VALUE - 1 = " + varLong1);
        System.out.println(" long MAX VALUE + 1 = " + varLong2);

        long varShort1, varShort2;
        varShort1 = Short.MIN_VALUE;
        varShort2 = Short.MAX_VALUE;
        System.out.println(" short MIN VALUE = " + varShort1);
        System.out.println(" short MAX VALUE = " + varShort2);
        varShort1 = varShort1 - 1;
        varShort2 = varShort2 + 1;
        System.out.println(" short MIN VALUE - 1 = " + varShort1);
        System.out.println(" short MAX VALUE + 1 = " + varShort2);
        varShort1 = Short.MIN_VALUE - 1;

        float varFloat1, varFloat2;
        varFloat1 = Float.MIN_VALUE;
        varFloat2 = Float.MAX_VALUE;
        System.out.println(" float MIN VALUE = " + varFloat1);
        System.out.println(" float MAX VALUE = " + varFloat2);
        varFloat1 = varFloat1 - 1;
        varFloat2 = varFloat2 + 1;
        System.out.println(" float MIN VALUE - 1 = " + varFloat1);
        System.out.println(" float MAX VALUE + 1 = " + varFloat2);

        double varDouble1, varDouble2;
        varDouble1 = Double.MIN_VALUE;
        varDouble2 = Float.MAX_VALUE;
        System.out.println(" double MIN VALUE = " + varDouble1);
        System.out.println(" double MAX VALUE = " + varDouble2);
        varDouble1 = varDouble1 - 1;
        varDouble2 = varDouble2 + 1;
        System.out.println(" double MIN VALUE - 1 = " + varDouble1);
        System.out.println(" double MAX VALUE + 1 = " + varDouble2);





    }
}
