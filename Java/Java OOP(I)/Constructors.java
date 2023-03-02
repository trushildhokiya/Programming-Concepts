public class Constructors {
    public static void main(String[] args) {
        //a constructor is just like a method with no return type used to initialize the newly created objects
        //default constructor
        //a class by default has a constructor which initialies values to default values for string null
        //and for int 0 it initializes this values to the new obj created 
        Cars myCar = new Cars();
        System.out.println(myCar.name+" "+myCar.value);

        Sports sport1= new Sports();
        System.out.println(sport1.name+" "+sport1.playersCount);

        Sports sport2= new Sports("Cricket");
        System.out.println(sport2.name+" "+sport2.playersCount);

        Sports sport3= new Sports("Football",11);
        System.out.println(sport3.name+" "+sport3.playersCount);
    }
}

class Cars{
    String name;
    int value;
}

class Sports{
    String name;
    int playersCount;

    //no arguement consructor
    Sports(){
        System.out.println("A new sport created name: "+name);
    }

    //parameterized constructor
    Sports(String name){
        this.name=name;
    }

    Sports(String name , int playersCount){
        this.name=name;
        this.playersCount=playersCount;
    }

    //when you create multiple constructor with same name and different parameters it is called constructor
    //overloading
}
