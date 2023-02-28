public class Cat extends Animal{
    boolean nightVision = true;

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void sound() {
        System.out.println("Meow Meow");
    }
}

