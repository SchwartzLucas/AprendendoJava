package OverloadigOverriding;

public class Runit {
    public static void main(String[] args){
        MathProcessor mp = new MathProcessor();
        method mt = new method();

        int[] a = {1,2,3,4,5};
        mp.process(a);
        mp.process(2,3);

        mt.process(a);
        mt.process(2,3);
    }
}
