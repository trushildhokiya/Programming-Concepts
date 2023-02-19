public class Interface {
    public static void main(String[] args) {
        Employee emp1 = new Employee();      
        emp1.say();  
        emp1.calculate();
    }
}

/*
 * An interface is a fully abstract class. It includes a group of abstract methods (methods without a body).
 */
interface Cashier{
    void calculate();

    default void say(){
        System.out.println("I am a cashier");
    }
}


interface Manager {
    void manage();
}

interface Boss extends Cashier,Manager{
    void handle();
}

class Employee implements Boss{

    @Override
    public void handle() {
        // TODO Auto-generated method stub
        System.out.println("I can handle");       
    }

    @Override
    public void manage() {
        // TODO Auto-generated method stub
        System.out.println("I can manage");
    }

    @Override
    public void calculate() {
        // TODO Auto-generated method stub
        System.out.println("I can calculate");
        
    }
    
}