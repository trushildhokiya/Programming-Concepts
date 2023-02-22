import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Reflection {
    public static void main(String[] args) {
        Human markus =new Human("Markus");
        
        //using reflection in java 
        Class HumanReflect = markus.getClass();
        System.out.println("Class Name :"+HumanReflect.getName());
        System.out.println("Class access Modifier: "+Modifier.toString(HumanReflect.getModifiers()));
        System.out.println("Super class of Human: "+HumanReflect.getSuperclass().getName());

        //java reflection of methods
        Method[] humanMethods = HumanReflect.getDeclaredMethods();
        for(Method x : humanMethods){
            System.out.println("--------------------------------------------------");
            System.out.println("Method name: "+x.getName());
            System.out.println("Access Modifier: "+Modifier.toString(x.getModifiers()));
            System.out.println("Return Type: "+x.getReturnType());
            System.out.println("Total requires Parameters: "+x.getParameterCount());
            System.out.println("-----------------------------------------------");
        }

        //java public and private field reflection:
        
        Car myCar = new Car();
        Class myCarReflect = myCar.getClass();

        try {
            // for public field
            //use getField method
            Field field1 = myCarReflect.getField("company");
            field1.set(myCar, "Mercedes");
            System.out.println("Value of field: "+field1.get(myCar));
            System.out.println("Access Modifier: "+Modifier.toString(field1.getModifiers()));
            System.out.println("----------------------------------------------------------");

            //for private field
            //use getDeclaredField() method
            Field field2 = myCarReflect.getDeclaredField("value");
            field2.setAccessible(true);
            field2.set(myCar,999122);
            System.out.println("Value of field: "+field2.get(myCar));
            System.out.println("Access Modifier: "+Modifier.toString(field2.getModifiers()));
            System.out.println("----------------------------------------------------------");

        } catch (NoSuchFieldException e) {
            System.out.println("NO such field exists");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Reflection of java Constructor
        Constructor[] allConstructor = HumanReflect.getDeclaredConstructors();
        for(Constructor x: allConstructor){
            System.out.println("----------------------------------------------------------------");
            System.out.println("Constructor name: "+x.getName());
            System.out.println("Access Modifier: "+Modifier.toString(x.getModifiers()));
            System.out.println("Parameter count: "+x.getParameterCount());
            System.out.println("Parameter Types: "+Arrays.toString(x.getParameterTypes()));
            System.out.println("-----------------------------------------------------------------------");
        }
        
    }
}

class LivingObject{
    String race;

    LivingObject(String race){
        this.race=race;
    }

    //default constructor
    LivingObject(){};

}

final class Human extends LivingObject{
    public String name;
    
    //default constructor
    public Human(){super("Human");};

    public Human(String name){
        super("Human");
        this.name=name;
    };

    private Human(boolean isMarried){

    };

    public void eat(){
        System.out.println("Human is eating");
    }

    private void study(){
        System.out.println("Human is studing");
    }

    protected void sleep(){
        System.out.println("Human is sleeping");
    }
}

class Car{
    public String company;
    private int value;
}