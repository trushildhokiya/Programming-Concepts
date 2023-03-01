import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        
        LinkedList<String> cars =   new LinkedList<>();

        //adding in linked list 
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Tesla");
        cars.add(3,"Lambhorgini");

        System.out.println("Linked list after adding elements: "+cars);

        //accessing elements in linked list

        System.out.println("Second element in linked list is: "+cars.get(1));

        //change elements of linked list
        cars.set(1,"Ferrari");
        System.out.println("After changing Linkedlist: "+cars);

        //remove element from Linked list
        cars.remove();
        System.out.println("Linked list after removing element: "+cars);

        //clear linkedlist 
        cars.clear();
        System.out.println("Linked list after clearing: "+cars);
    }    
}
