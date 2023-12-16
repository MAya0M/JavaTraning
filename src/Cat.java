public class Cat extends Mammal{
    public Cat(String name, int age) {
        super(name, age);
    }

    public void meow() {
        System.out.println(getName() + " says meow!");
    }
}
