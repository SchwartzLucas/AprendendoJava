package Encapsulation;

public class Pai {

    private String Name;

    public Pai(){
        Name = "";
    }

    public  Pai(String name){
        this.Name = name;
    }

    // métodos get e set

    protected String getName(){
        return Name;
    }
    protected void setName(String Name){
        this.Name = Name;
    }

}
