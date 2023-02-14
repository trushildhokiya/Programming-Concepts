import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        
        //output to console can be printed by three methods (println , print and printf)
        int myLuckuNum = 26;
        System.out.println(myLuckuNum);
        System.out.print(myLuckuNum);
        System.out.printf("\nMy lucky number is %d",myLuckuNum);

        // input can be taken from user using scanner class
        //first we import scanner class from java.util.Scanner;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your lucky number :");

        //accepting integer
        myLuckuNum = sc.nextInt();
        sc.close();

        //you can read diffrent input such as float string double using functions of scanner class
        //such as nextLine() nextfloat() next() nextdouble() etc 
        System.out.println(myLuckuNum);
    }
}
