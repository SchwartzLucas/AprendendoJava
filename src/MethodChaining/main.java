package MethodChaining;

public class main {
    public static void main(String[] args){

        String name = "Lucas";

        name = (name.concat(" Schwartz").toUpperCase());

        System.out.println(name);
    }

}

