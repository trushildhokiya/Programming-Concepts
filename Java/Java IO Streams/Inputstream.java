import java.io.FileInputStream;
import java.io.InputStream;

public class Inputstream {
    public static void main(String[] args) {
        
        byte[] data = new byte[3392];

        //creating input stream
        try{
            InputStream stream = new FileInputStream("example.txt");

            //available()
            System.out.println("Available bytes of data in file is: "+stream.available());
            //reading data from file
            stream.read(data);

            // converting data (byte)-> (string) 

            String data1 = new String(data);
            System.out.println(data1);
            stream.close();

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}