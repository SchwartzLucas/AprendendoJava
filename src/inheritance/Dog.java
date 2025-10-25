package inheritance;

public class Dog extends Animal{
    private String Color;
    private String Name;

    public Dog(boolean mamifero, String whatEat, int numberofLegs){
            super(mamifero, whatEat, numberofLegs);
            this.Color = "Black";
            this.Name = "Bolt";
    }

    public Dog(boolean mamifero, String whatEat, int numberofLegs, String color, String name) {
            super(mamifero, whatEat, numberofLegs);
            this.Color = color;
            this.Name = name;
    }

    public String getColor(){
        return Color;
    }

    public void setColor(String color){
        this.Color = color;
    }

    public String getName(){
        return Name;
    }

    public void setName(String name){
        this.Name = name;
    }
}
