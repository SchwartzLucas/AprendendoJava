package inheritance;

import java.util.Scanner;

public class TestInheritance {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Dog dog = new Dog(true, "ração", 4, "white", "Bethoven");
        dog.setMamifero(false);

        System.out.println("Your dog " + dog.getName() + " is an mamifero? \n" + (dog.isMamifero() ? "YES" : "NO"));
        System.out.println("What your dog eats? ");
        String WhatMyDogEats = sc.nextLine();
        dog.setEats(WhatMyDogEats);
        System.out.println("My dog eat: " + dog.getEats());
        System.out.println("And his color is: " + dog.getColor());

        sc.close();
    }
}
