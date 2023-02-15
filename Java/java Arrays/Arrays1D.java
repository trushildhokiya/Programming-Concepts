import java.util.Scanner;
import java.util.Arrays;
public class Arrays1D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declae an array 
        // datatype[] array_name = new datatype[size] or direct intializaion
        int[] numbers = new int[5];    
        for(int i=0;i<numbers.length;i++){
            System.out.println("Enter number"+(i+1));
            int x= sc.nextInt();
            numbers[i]=x;
        }

        int sum=0 ;
        for(int y: numbers){
            sum=sum+y;
        }

        System.out.println("Sum is : "+sum);
        System.out.println("Average is : "+(sum/numbers.length));

        //two ways to print an array:
        //1. using for loop 

        for(int i=0 ; i<numbers.length;i++){
            System.out.print(numbers[i]+"\t");
        }
        System.out.println("\n");
        //2. using for each loop

        for(int x : numbers){
            System.out.print(x+"\t");
        }
        System.out.println("\n");

        //3.using Arrays.toString Method
        System.out.println(Arrays.toString(numbers));

    }
}
