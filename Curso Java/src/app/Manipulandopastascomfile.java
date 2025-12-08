package app;
import java.io.File;
import java.util.Scanner;

public class Manipulandopastascomfile {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the folder path: ");
            String folderPath = sc.nextLine();
            
            File path = new File(folderPath);
            
            File[] folders = path.listFiles(File::isDirectory); // lista somente o que é pasta
            
            System.out.println("FOLDERS: ");
            
            for(File folder : folders){
                System.out.println(folder);
            }
            
            File[] files = path.listFiles(File::isFile); // lista somente o que é arquivo
            
            System.out.println("FILES: ");
            
            for(File file : files){
                System.out.println(file);
            }
            
            boolean success = new File(path + "\\teste de pasta").mkdir();
            System.out.println("Diretorio criado com sucesso: " + success);
        }
    }
    
}
