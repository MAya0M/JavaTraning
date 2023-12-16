public class Turtle extends Reptile{
    public Turtle(String name, int age) {
        super(name, age);
    }

    public void swim() {
        System.out.println(getName() + " is swimming slowly.");
    }
}
