package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
    private List<Integer> list = new ArrayList<>();

    public PrintService() {
    }

    

    public void print(){
        System.out.println(list);
    }

    public void addValue(int value){
        this.list.add(value);
    }

    public void first(){
        list.getFirst();
    }
}
