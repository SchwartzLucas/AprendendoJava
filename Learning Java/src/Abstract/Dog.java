package Abstract;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void FazerSom() {
        System.out.println("Au AU");
    }
}
