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
        









    }
}
