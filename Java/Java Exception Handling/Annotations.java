import java.util.ArrayList;

public class Annotations {
    @SuppressWarnings("unchecked")
    //supresses warnings due to unchecked declaration of arraylist i.e
    //data types must be added in <> brackets
    public static void main(String[] args) {
        
        ArrayList list = new ArrayList<>();
        list.add("Pizza");
        System.out.println(list);
    }
    
}


//there are several annonations in java one we have already used is @Override in method overriding