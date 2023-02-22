import java.util.Arrays;

public class Enums {
    public static void main(String[] args) {
        

        //code1 
        System.out.println(Education.BACHELORS);
        System.out.println(Education.PHD);

        //craeting variable of enum type;
        Education myEducation = Education.BACHELORS;

        //USing Switch statement with enums
        switch(myEducation){
            case SCHOOL -> System.out.println("You should aheive more");
            case HIGHSCHOOL -> System.out.println("Plan your future");
            case BACHELORS -> System.out.println("Can start Earning !");
            case MASTERS -> System.out.println("Woho! You acheived a masters degree! ");
            case PHD -> System.out.println("Cant study further");
        }

        //code 2:
        Ingredients myIngredients = Ingredients.COCOA;
        myIngredients.get_a_response();

        //code 3
        //Java enum built in functions

        //1.The ordinal() method returns the position of an enum constant.
        System.out.println("My Ingredient is at place "+myIngredients.ordinal());;

        //2.The compareTo() method compares the enum constants based on their ordinal value
        System.out.println("Differnce in myIngredients and KETCHUP is "+myIngredients.compareTo(Ingredients.KETCHUP));

        //3. The toString() method returns the string representation of the enum constants
        System.out.println("my Ingredients in string :"+myIngredients.toString());

        //4. The name() method returns the defined name of an enum constant in string form. The returned value from the name() method is final.
        System.out.println("My ingredient name is "+myIngredients.name());

        //5.The valueOf() method takes a string and returns an enum constant having the same string name
        System.out.println("Value of MAYOO is "+Ingredients.valueOf("MAYOO"));
        
        //6. The values() method returns an array of enum type containing all the enum constants.
        Ingredients[] allIngredients = Ingredients.values();
        
        //printing all ingredients 
        System.out.println(Arrays.toString(allIngredients));
    }
}


//Creating an Enum 
/*
 * In Java, an enum (short for enumeration) is a type that has a fixed set of constant values
 * . We use the enum keyword to declare enums.
 */

 enum Education{
     SCHOOL , HIGHSCHOOL , BACHELORS , MASTERS , PHD
 }

 //craeting enum classes
 enum Ingredients{
    MAYOO , KETCHUP , COCOA;

    public void get_a_response(){
        if(this==MAYOO){
            System.out.println("Mayo is great");
        }
        else if (this==KETCHUP){
            System.out.println("Weird tatse");
        }
        else if(this==COCOA){
            System.out.println("Something delicious! ");
        }
        else{
            System.out.println("Noobs!");
        }
    }
 }