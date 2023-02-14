import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        //reate instance of scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Enter operator: ");
        char opr = sc.next().charAt(0);

        sc.close();

        if(opr=='+'){
            System.out.println("Result: "+(x+y));
        }
        else if(opr== '-'){
            System.out.println("Result: "+(x-y));
        }
        else if(opr=='*'){
            System.out.println("Result: "+(x*y));
        }
        else if(opr=='/'){
            System.out.println("Result: "+(x/y));
        }
        else if(opr=='%'){
            System.out.println("Result: "+(x%y));
        }
        else{
            System.out.println("Enter valid operator! ");
        }

        //this is an example of if else if  else  statements 
        //similar;y nested if else can also be used
    }
}
