public class MethodOverriding {
    public static void main(String[] args) {
        Car myCar = new Car("85588",3);
        myCar.start();
    }
}

//Ruls for method Overrding
// Both the superclass and the subclass must have the same method name, the same return type and the same parameter list.
// We cannot override the method declared as final and static.
// We should always override abstract methods of the superclass
//overriden  method must have same or largen scope thn overrideen method
//eg : private -> public : VAlID
// public -> protected  : INVALID

class Vehicle{
    String modelNo;
    int number_of_wheels;

    Vehicle(){};

    Vehicle(String modelNo, int number_of_wheels){
        this.modelNo=modelNo;
        this.number_of_wheels=number_of_wheels;
    }

    protected void start(){
        System.out.println("Vehicle has been started!");
    }

    public void stop(){
        System.out.println("Vehicle has stopped moving");
    }
}

class Car extends Vehicle{
    
    Car(String modelNo, int number_of_wheels){
        super(modelNo,number_of_wheels);
    }
    @Override
    public void start(){
        System.out.println("Car has been started");
    }

    @Override
    public void stop(){
        System.out.println("Car has stopped moving");
    }

}