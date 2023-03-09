import java.util.ArrayList;
import java.util.Collections;

public class Algorithms {
    public static void main(String[] args) {
        
        //sort()
        ArrayList<Integer> array = new ArrayList<>();
        array.add(15);
        array.add(5);
        array.add(135);
        array.add(105);
        array.add(-15);

        Collections.sort(array);
        System.out.println(array);

        //shuffle() 
        Collections.shuffle(array);
        System.out.println(array);

        //Routine data manipulation
        //1. reverse
        Collections.reverse(array);
        System.out.println(array);

        //2.swap()
        Collections.swap(array, 0, 02);
        System.out.println(array);

        //creating new arrayList
        ArrayList<Integer> data  =new ArrayList<>(2);

        //3. addAll()
        data.addAll(array);
        System.out.println(data);

        //4. fill()
        Collections.fill(data, 12);
        System.out.println(data);

        //searching using binary search
        System.out.println(Collections.binarySearch(array, -15));

        //frequency() and disjoint()
        System.out.println("Frequency of 12 in data: "+Collections.frequency(data, 12));
        System.out.println("Are data and array disjoint: "+Collections.disjoint(array, data));

        //Finding minimum and maximum 
        System.out.println("Maximum in array is: "+Collections.max(array));
        System.out.println("Minimum in array is: "+Collections.min(array));
    }
}
