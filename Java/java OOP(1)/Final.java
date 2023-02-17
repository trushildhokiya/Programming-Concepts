public class Final {
    public static void main(String[] args) {
        final int number = 10;
        // number = 100; // wll lead to compilation error

        //similarly we can make methods class final 
        //a class cnnot extenf final class
        //a final method cannot be overriden

        Cars car1 = new Cars();
        car1.getName();
    }  
}

final class Cars{
    String name="Huandai";
    
    public void getName(){
        System.out.println(name);
    }
}

//will lead to error
// class Honda extends Cars{

// }