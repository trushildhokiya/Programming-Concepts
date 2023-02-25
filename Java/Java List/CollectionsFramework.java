import java.util.ArrayList;

public class CollectionsFramework {
    public static void main(String[] args) {
        
        //example of Array List
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Monkey");
        animals.add("Lion");
        animals.add("Rhinosoreaus");
        System.out.println(animals);
    }
}

/*
 * The Java collections framework provides various data structures and algorithms that can be used directly. This has two main advantages:

We do not have to write code to implement these data structures and algorithms manually.
Our code will be much more efficient as the collections framework is highly optimized.
Moreover, the collections framework allows us to use a specific data structure for a particular type of data. Here are a few examples,

If we want our data to be unique, then we can use the Set interface provided by the collections framework.
To store data in key/value pairs, we can use the Map interface.
The ArrayList class provides the functionality of resizable arrays.
 */