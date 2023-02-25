import java.util.Iterator;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        
        //declaring stacks
        Stack<Integer> tableOf7 = new Stack<Integer>();

        //methods of stack push , pop , peek , is empty
        tableOf7.push(7);
        tableOf7.push(14);
        tableOf7.push(21);
        tableOf7.push(28);
        tableOf7.push(35);

        
        System.out.println(tableOf7);

        //pop elememts
        System.out.println("Removed element is"+tableOf7.pop());

        //peek method
        System.out.println("top os stack has : "+tableOf7.peek());
        System.out.println("Index of 21 is "+tableOf7.search(21));
    }
}
