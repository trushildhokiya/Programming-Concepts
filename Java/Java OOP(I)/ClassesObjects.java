public class ClassesObjects {
    public static void main(String[] args) {
        //create an object / instance of a variable using new keyword
        Cars mycar = new Cars();
        
        System.out.println(mycar.name);
        mycar.startCar();
    }    
}

//create a class called cars and add its states and functions
//class is a blueprint or template of a thing/object
//it has some values and methods/functions
class Cars{
    String name="myCar";
    int modelNumber=001245;

    void startCar(){
        System.out.println("Car is accelerating! ");
    }
}