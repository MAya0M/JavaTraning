public class Mammal extends Animal {

    public Mammal(String name, int age) {
        super(name, age);
    }

    public void giveBirth() {
        System.out.println(getName() + " is giving birth.");
    }


}
