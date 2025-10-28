package Abstract;

public class Main {
    public static void main(String[] args) {
        Dog c1 = new Dog("Hex");

        c1.FazerSom();
        c1.dormir();

        Cat c2 = new Cat("Suq");

        c2.FazerSom();
        c2.dormir();
    }
}
