import java.util.Locale.Category;

public class Super {
    public static void main(String[] args) {
        Humans Melissa = new Humans(21, "female");
        Humans Abraham = new Humans();
        Melissa.hunt();
        Melissa.getCategory();

    }
}

// Uses of super keyword
// To call methods of the superclass that is overridden in the subclass.
// To access attributes (fields) of the superclass if both superclass and subclass have attributes with the same name.
// To explicitly call superclass no-arg (default) or parameterized constructor from the subclass constructor.

class LivingBeing{
    String Catgeory;
    int age;

    LivingBeing(){
        System.out.println("New Life has been Created");
    };

    LivingBeing(String Category){
        this.Catgeory = Category;
    }

    LivingBeing(String Category , int age){
        this.Catgeory=Category;
        this.age=age;
    }

    public void hunt(){
        System.out.println(Catgeory+" is hunting something");
    }

    public void rest(){
        System.out.println(Catgeory+" is resting! zrr");
    }
}

class Humans extends LivingBeing{
    String gender;

    Humans(){};
    Humans(int age, String gender){
        super("Humans",age);
        this.gender=gender;
    }

    @Override
    public void hunt(){
        System.out.println("Human is hunting in the forest! After 2hrs...");
        super.rest();
    }

    public void getCategory(){
        System.out.println(super.Catgeory);
    }
}