package app;
import java.util.Scanner;
import services.PrintService;

public class GenericsUse {
    public static void main(String[] args) {

        PrintService ps = new PrintService();

        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many? ");
        int resposta = sc.nextInt();

        for(int i = 0; i < resposta; i++){
            ps.addValue(sc.nextInt());
        }
        ps.print();
        ps.first();
    }
}
