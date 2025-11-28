package MethodChaining;

public class main {
    public static void main(String[] args){

        String name = "Lucas";

        name = (name.concat(" Schwartz").toUpperCase());

        System.out.println(name);

        Presenting p1 = new Presenting();

        p1.setName("Lucas").setAge(21).setGender('M');

        p1.Presenting();
    }

}

