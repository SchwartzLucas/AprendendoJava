package Abstract;

public abstract class Animal {

    String Name;

    public Animal(String name){
        this.Name = name;
    }

    public abstract void FazerSom(); // não precisa implementar - quem herda que implementa
    public void dormir(){
        System.out.println( Name + " está domindo");
    }
}
