public class loops {

    public static void main(String[] args) {

        int sum = 0;
        int i = 0;
        while (i<=20) {
            sum = sum +i;
            i++;
        }
        System.out.println("SUma liczb od 0 do 20 to "+ sum);

        i =0;
        do {
            if (i % 2 == 0) {
                System.out.println(i + " to liczba parzysta");
            }
            i++;
        } while ( i <= 20);

        i =0;
        do {
            if ((i % 2 == 0) && (i % 3 == 0)) {
                System.out.println(i + " podzielne przez 2 i 3 ");
            }
            i = i+ 1;
        } while ( i <= 100);


    }
}
