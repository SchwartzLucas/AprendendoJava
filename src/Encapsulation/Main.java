package Encapsulation;

import Encapsulation.test.Filho3;

public class Main {
    public static void main(String[] args) {
        Pai p = new Pai();
        p.setName("Schwartz");
        System.out.println(p.getName());

        Pai p2 = new Pai("oliver");

        System.out.println(p2.getName());

        Filho f = new Filho();

        Filho3 f3 = new Filho3();
        f3.getName();
    }
}
