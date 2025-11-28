package OverloadigOverriding;

import java.util.Arrays;
import java.util.Objects;

public class method {

    public void process(int a, int b){
        System.out.println("processando dois inteiros: " + a + b);
    }
    public void process(int[] ints){
        System.out.println("processando um array: " + Arrays.toString((ints)));
    }
    public void process(Object[] obj){
        System.out.println("processando um objeto: " + Arrays.toString((obj)));
    }


}
