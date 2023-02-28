public class Human extends Animal{
    public Human(String name, int age) {
        super(name, age);
    }

    @Override
    void sound() {
        System.out.println("Talk");
    }
}
