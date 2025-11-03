package OverloadigOverriding;

public class MathProcessor extends method{

    @Override
    public void process(int a, int b){
        System.out.println("Somando inteiros: " + (a + b));
    }

    @Override
    public void process(int[] ints) {
        int sum = 0;
        for(int i = 0; i < ints.length; i++){
            sum += ints[i];
        }
        System.out.println("Soma dos inteiros do array: " + sum);
    }

}
