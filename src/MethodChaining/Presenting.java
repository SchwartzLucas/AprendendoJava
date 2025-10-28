package MethodChaining;

public class Presenting {
    private String Name;
    private int Age;
    private char Gender;

    public Presenting setName(String name){
        this.Name = name;
        return  this;
    }

    public Presenting setAge(int age){
        this.Age = age;
        return this;
    }

    public Presenting setGender(char gender){
        this.Gender = gender;
        return this;
    }

    public void Presenting(){
        String presenting = "Nome: " + Name + " idade: " + Age +" do genero " + (Gender == 'F' ? "Feminino" : "masculino");

        System.out.println(presenting);
    }
}
