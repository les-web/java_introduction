package loops;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);

        int tryCounter = 0;
        int inputNumber = -1;

        do {
            System.out.println("Podaj liczbę od 1 do 10 ");
            inputNumber = scanner.nextInt();
            tryCounter++;
        }
        while (randomNumber != inputNumber);
        System.out.println("Zgadłeś za " + tryCounter + "razem");


    }
}
