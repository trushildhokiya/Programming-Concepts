public class Polymorphism {
    public static void main(String[] args) {
        Trucks truck = new Trucks();
        truck.start();        
    }
}

/*
 * We can achieve polymorphism in Java using the following ways:

Method Overriding
Method Overloading
Operator Overloading
 */

 class Vehicle{
    int price;

    public void start(){
        System.out.println("Vehicle is starting ...");
    }
 }

 class Trucks extends Vehicle{

    @Override
    public void start(){
        System.out.println("Truck has started moving...");
    }
 }