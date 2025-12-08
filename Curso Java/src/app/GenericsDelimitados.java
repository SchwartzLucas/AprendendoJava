package app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import services.CalculationService;

public class GenericsDelimitados {
    public static void main(String[] args) {
        String path = "/Users/lucasschwartzdesouza/Documents/testeMaximo.txt";

        List<Integer> list = new ArrayList<>();


        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while(line != null){
                list.add(Integer.parseInt(line));
                line = br.readLine();
            }

            Integer x = CalculationService.max(list);
            System.out.println("MAX: ");
            System.out.println(x);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
