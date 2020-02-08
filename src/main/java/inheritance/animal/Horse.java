package inheritance.animal;

public class Horse extends Animal {

    private int rating;

    public Horse(String name, int age, int rating) {
        super(name, age);
        this.rating = rating;
    }

    @Override
        public void voice (){
   //     super.voice();       // możemy odwołać się do pierwotnej metody z klasy naczelnej
        System.out.println("Horse " + getName() +  " says yhahahah !!!!")  ;

    }
    public void ride(int speed){
        System.out.println("Horse " +getName() + "with rating " + rating + " rides with speed " + speed+ "km/h");

    }

}


