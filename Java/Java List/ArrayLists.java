import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {

        //declaring new arraylist
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //adding elements in array list
        numbers.add(-12);
        numbers.add(14);
        numbers.add(24);
        numbers.add(1);
        numbers.add(-144);

        //accessing arraylst elemets

        System.out.println("Number at index 4 is :"+numbers.get(4));

        //change array list elements
        numbers.set(2,999);

        //get size of arraylist
        System.out.println("Size of array list is: "+numbers.size());

        //sort the arraylist
        numbers.sort(null);
        System.out.println("Sorted arraylist is: "+numbers);

        //clone a arraylist
        ArrayList<Integer> duplicate =(ArrayList<Integer>)numbers.clone();
        System.out.println("Duplicate array list is "+duplicate);

        //check is array list is empty
        System.out.println("Is array list empty: "+numbers.isEmpty());

        //chck if aray list contains an element
        System.out.println("Is 144 in list? "+numbers.contains(144));

        //remove element from array list
        numbers.remove(2);
        System.out.println(numbers);

    }
}