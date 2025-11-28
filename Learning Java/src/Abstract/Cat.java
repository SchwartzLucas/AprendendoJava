package Abstract;

public class Cat extends Animal{


    public Cat(String name) {
        super(name);
    }

    @Override
    public void FazerSom() {
        System.out.println("Miau");
    }
}
