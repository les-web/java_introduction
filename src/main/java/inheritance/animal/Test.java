package inheritance.animal;

public class Test {

    public static void main(String[] args) {
 //       Animal animal = new Animal("Zenek", 2); // dodaliśmy abstract przy definicji klasy
 //       animal.setName("Zenek");
 //       animal.setAge(2);
 //       animal.voice();

        Lion simba = new Lion("Simba",3);
 //       simba.setName("Simba");
 //       simba.setAge(3);
        simba.voice();
      //  simba.roar();

        Horse tomek = new Horse("Tomek", 5, 9);
   //     tomek.setAge(44);
  //      tomek.setName("Tomek");
        tomek.ride(10);

        Animal animal2 = new Lion("Zdzisiek", 6);
        Animal animal3 = new Horse("Antek", 7, 9);


        System.out.println("----------------------------------");
   //     ((Lion) animal2).roar();
        Animal [] zoo = new Animal [] {simba, tomek, animal2, animal3};
        for (Animal  ani : zoo) {
            ani.voice();
        }

    }
}
