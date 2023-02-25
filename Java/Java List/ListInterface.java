import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        
        //implementing array list using list interface
        List<String> animals = new ArrayList<String>();

        //adding elements in list 
        animals.add("Lion");
        animals.add("tiger");
        animals.add("Cheetah");

        //get element at index in array lis

        System.out.println(animals.get(1));

        //remove element from arraylist
        animals.remove(1);
        System.out.println(animals);

        //implementing linked list using list interface

        List<Integer> numbers = new LinkedList<Integer>();
        
        //adding number in linked list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        //get number at particular index in linked list
        System.out.println(numbers.get(1));

        //get position of a number in linked list
        System.out.println(numbers.indexOf(30));

        //delete number at particular index from linked list
        numbers.remove(1);
        System.out.println(numbers);

    }
}
