import java.security.DrbgParameters.Reseed;

/*
 * Java annotations are metadata (data about data) for our program source code. There are several predefined annotations
 *  provided by the Java SE. Moreover, we can also create custom annotations as per our needs.
 */
/*
 * These annotations can be categorized as:

1. Predefined annotations

@Deprecated
@Override
@SuppressWarnings
@SafeVarargs
@FunctionalInterface
2. Custom annotations

3. Meta-annotations

@Retention
@Documented
@Target
@Inherited
@Repeatable
 */

 /*
  * As the name suggests,
   the @SuppressWarnings annotation instructs the compiler to suppress warnings that are generated
    while the program executes.

We can specify the type of 
warnings to be suppressed. The warnings that can be suppressed are compiler-specific but there are two 
categories of warnings: deprecation and unchecked.
  */
public class AnnotationsTypes {
    
    public static void main(String[] args) {
        Calculator.modifiedDivide(12, 6);   
        
        //Calculator.divide(12, 4);

        Calculator.add(1,2,3,4,5,6,7,8,9,10);
        Dog dog1 = new Dog();
        dog1.talk();
    }
}

class Calculator{
    /*
     * The@Deprecated annotation is a marker annotation that indicates the element (class, method, field, etc)
     *  is deprecated and has been replaced by a newer element.
     */

    @Deprecated
    public static void divide(int num1 , int num2){
        System.out.println(num1/num2);
    }

    public static void modifiedDivide(double num1  , double num2){
        double result=0;
        try{
            result = num1/num2;
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Result calculated is :"+result);
        }
    }

     /*
     * The @SafeVarargs annotation asserts that the annotated method 
     * or constructor does not perform unsafe operations on its varargs (variable number of arguments).
     */

    @SafeVarargs
    public static void add(int ...v){
        int sum=0;

        for(int x: v){
            sum=sum+x;
        }

        System.out.println("Addition of all numbers is: "+sum);
    }

}

/*
 * Java 8 first introduced this @FunctionalInterface annotation. This annotation 
 * indicates that the type declaration on which it is used is a functional interface. A functional interface can have only one abstract method.
 */

 @FunctionalInterface
 interface Activity{
    void hunt();
 }

class Animal implements Activity{
    String type;
    int age;    

    public void talk(){
        System.out.println("Animal is speaking !! ");
    }

    public void hunt(){
        System.out.println("Animal is hunting");
    }
}

class Dog extends Animal{

    @Override
    public void talk(){
        System.out.println("Woof! woof...");
    }
}