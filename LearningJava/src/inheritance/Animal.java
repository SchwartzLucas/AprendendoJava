package inheritance;

public class Animal {

    private boolean Mamifero;
    private  String Eats;
    private  int NumberOfLegs;

    public Animal(){

    }

    public Animal(boolean mamifero, String eats, int numberOfLegs){
        this.Mamifero = mamifero;
        this.Eats = eats;
        this.NumberOfLegs = numberOfLegs;
    }

    public boolean isMamifero(){
        return Mamifero;
    }

    public void setMamifero(boolean mamifero){
        this.Mamifero = mamifero;
    }

    public String getEats(){
        return Eats;
    }

    public void setEats(String eatWhat){
        this.Eats = eatWhat;
    }

    public int getNumberOfLegs(){
        return NumberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs){
        this.NumberOfLegs = numberOfLegs;
    }

}
