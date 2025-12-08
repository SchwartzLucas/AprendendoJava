package app;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndBufferedWriter {
    public static void main(String[] args){
        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night"};
        String path = "/Users/lucasschwartzdesouza/Documents/testeout.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ // com true não recria o arquivo e sim adiciona mais linhas

            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }

        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}