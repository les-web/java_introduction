package classes.basics.exercise.homework20200219;
/*
#RomanToDecimal

(source: https://github.com/TDD-Katas/roman-numerals#problem-description)

###Problem description The Kata says you should write a function to convert from Roman Numerals to decimal numerals.
 In order to keep the kata light, we will not check for valid Roman Numeral.

Roman numerals, the numeral system of ancient Rome, uses combinations of letters from the Latin alphabet to signify values.
 They are based on seven symbols:

Symbol	Value
I	1
V	5
X	10
L	50
C	100
D	500
M	1000
Numbers are formed by combining symbols together and adding the values.
Generally, symbols are placed in order of value, starting with the largest values.
When smaller values precede larger values, the smaller values are subtracted from the larger values,
and the result is added to the total.
Example:

Roman Number	Computation	Value	Comment
MMVI	1000 + 1000 + 5 + 1	2006	only addition
MCMXLIV	1000 + (1000 - 100) + (50 - 10) + (5 - 1)

SOLUTION
-----------
copied (with pride) from:
http://www.sourcecodeera.com/blogs/Samath/Convert-Roman-numerals-to-decimal-using-Java.aspx
Write a program that converts a number entered in Roman numerals to decimal.
Your program should consist of a class, say, Roman. An object of type Roman should do the following:
a. Store the number as a Roman numeral.
b. Convert and store the number into decimal.
c. Print the number as a Roman numeral or decimal number as requested by the user.

The decimal values of the Roman numerals are:
M 1000
D 500
C 100
L 50
X 10
V 5
I 1

d. You should be able to enter data into your program using the following Roman numerals :
MCXIV, CCCLIX, and MDCLXVI which should be able to produce outputs as shown below

Enter a roman number: MCXIV
The equivalent of the Roman numeral MCXIV is 1114

Enter a roman number: CCCLIX
The equivalent of the Roman numeral CCCLIX is 359

Enter a roman number: MDCLXVI
The equivalent of the Roman numeral MDCLXVI is 1666
 */
import java.util.Scanner;

public class Roman {
    static String romanNumeral;
    static int decimalNum;
    public static void main(String args[]) {
        Roman rmtoD = new Roman();
        rmtoD .convertToDecimal();
        rmtoD .printRoman(romanNumeral);
    }

    public void convertToDecimal () {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Roman number: ");
        romanNumeral = scan.nextLine();
        romanNumeral = romanNumeral.toUpperCase();

        int l=  romanNumeral.length();
        int num=0;
        int previousnum = 0;
        for (int i=l-1;i>=0;i--)
        {
            char x =  romanNumeral.charAt(i);
            x = Character.toUpperCase(x);
            switch(x)
            {
                case 'I':
                    previousnum = num;
                    num = 1;
                    break;
                case 'V':
                    previousnum = num;
                    num = 5;
                    break;
                case 'X':
                    previousnum = num;
                    num = 10;
                    break;
                case 'L':
                    previousnum = num;
                    num = 50;
                    break;
                case 'C':
                    previousnum = num;
                    num = 100;
                    break;
                case 'D':
                    previousnum = num;
                    num = 500;
                    break;
                case 'M':
                    previousnum = num;
                    num = 1000;
                    break;
            }
            if (num<previousnum)
            {decimalNum= decimalNum-num;}
            else
                decimalNum= decimalNum+num;
        }
    }
    public static void printRoman (String romanNumeral){
        System.out.println ("The equivalent of the Roman numeral "+romanNumeral+" is "+decimalNum);
    }
/*
    public static void printDecimal (int decimalNum){
        System.out.println ("Decimal Number stored is: " + decimalNum);
    }
*/
}
