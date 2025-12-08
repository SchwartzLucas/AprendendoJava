package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraDeArquivoInicial {

    public static void main(String[] args) {
        File file = new File("/Users/lucasschwartzdesouza/Documents/teste.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException ex) {
        }
    }
}
