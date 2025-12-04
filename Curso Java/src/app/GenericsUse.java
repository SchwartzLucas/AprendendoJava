package app;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.print.PrintService;

public class GenericsUse {
    public static void main(String[] args) {

        PrintService ps = new PrintService();

        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many? ");
        int resposta = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < resposta; i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        System.out.println("First: " + list.getFirst());

    }
}
