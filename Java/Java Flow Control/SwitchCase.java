import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number between 1-7");
        int myDay = sc.nextInt();

        sc.close();
        // new format of switch case no need to write break statements in this format
        switch (myDay) {
            case 1-> System.out.println("Sunday is great ! Enjoy Holday");
            case 2-> System.out.println("Monday ! A new star awaits");
            case 3-> System.out.println("Tuesday! Life goes on");
            case 4->System.out.println("wednesday! Feeling tired?");
            case 5->System.out.println("Thursday ! A ton of work pending?");
            case 6->System.out.println("Friday! Hurray lat workday!");
            case 7-> System.out.println("saturday! Relax and enjoy weekend");
            default-> System.out.println("Enter valid number! "); 
        }
    }    
}
