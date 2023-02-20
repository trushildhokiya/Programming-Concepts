public class NestedClasses {
    public static void main(String[] args) {
        //in order to create object of inner class and access its props we need to create an instance of the outer 
        //class and then create object of inner class using synatx:
        //OuterClass.InnerClass var = OuterClassvar.new InnerClassName(params);

        Robots robot1 = new Robots();
        Robots.Parts handR1 = robot1.new Parts(100000,"Robot 1 hand","#wer007778");
        
        Vehicle.Engine engine = new Vehicle.Engine();
        System.out.println(engine.fuel);
        
    }    
}

//nested classes and accessing members of outer class inside  inner class
class Robots{
    String modelNumber;

    Robots(String modelNumber){
        this.modelNumber=modelNumber;
    }

    Robots(){};

    class Parts{
        int cost;
        String name;
        
        Parts(){};

        Parts(int cost, String name,String modelNumber){
            this.cost=cost;
            this.name=name;
            Robots.this.modelNumber=modelNumber;
            System.out.println(Robots.this.modelNumber);
        }
    }
}

//static inner Class
class Vehicle{
    String mode;

    static class Engine{
        String fuel="Hydrogen Liquid";

    }
}