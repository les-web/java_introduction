package Arrays;

public class Exercise {

    public static void main(String[] args) {

        int [] numbers = new int [] {23,33,56,21,66,777,943,11};
        // znajdz maksymalną i minimalną wartość w tablicy
        int max = numbers[0];
        int min = numbers [0];
        double mean = 0.0D;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max){
                max = numbers[i];
            }
            if (numbers [i] < min) {
                min = numbers [i];
            }
            mean += numbers[i];


    }
        mean  /= numbers.length;
        System.out.println("Min "+min);
        System.out.println("Max " +max);
        System.out.println("Mean " +mean);

        for (int elem: numbers) {
            if (elem % 3 == 0) {
                System.out.println(elem + "jest podzielny przez 3");
            }
        }


    }
}
