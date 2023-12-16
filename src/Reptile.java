public class Reptile  extends Animal{
    public Reptile(String name, int age) {
        super(name, age);
    }

    public void layEggs() {
        System.out.println(getName() + " is laying eggs.");
    }
}
