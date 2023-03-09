import java.util.ArrayList;
import java.util.Iterator;

public class iteratorClass {
    public static void main(String[] args) {
        
        //creating arraylist
        ArrayList<Integer> data = new ArrayList<>();
        data.add(10);
        data.add(20);
        data.add(30);
        data.add(40);

        //creating iterator of data
        Iterator<Integer> iterator = data.iterator();

        //methods of iterator
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        //remove
        iterator.remove();
        System.out.println(data);

        //forEachRemaining
        iterator=data.iterator();
        while(iterator.hasNext()){
            iterator.forEachRemaining((value)->System.out.println(value*0.25));
        }
    }
}
