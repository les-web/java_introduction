package inheritance.animal;


public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void  voice() {
        System.out.println("Lion " + getName() + " roars!");
    }
}
