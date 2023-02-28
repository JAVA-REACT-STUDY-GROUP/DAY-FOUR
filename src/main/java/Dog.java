public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void sound() {
        System.out.println("Whoof Whoof");
    }
}
