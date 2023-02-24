import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Try_with_resources {
    public static void main(String[] args) {
        readFile("Thro_Throws.java");
    }

    public static void readFile(String filename){
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            while((line= br.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
