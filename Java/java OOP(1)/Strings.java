public class Strings {
    public static void main(String[] args) {
        /*
         * Strings are nothing but array of characters . It can be created using Wraper Class dircetly or using 
         *  the new Keyword for eg:
         * String name = "XYZ";
         * String yourName= new String("value");
         */
        String myCar = "Mercedes";
        String yourCar = "Mercedes";
        System.out.println(myCar+" "+yourCar);

        //sring concatination:
        String yourCar_myCar= myCar.concat(yourCar);
        System.out.println(yourCar_myCar);
        //OR
        System.out.println(myCar+yourCar);

        //String comparisions;
        System.out.println(myCar.equals(yourCar));

        //add double quotes inside a  string
        System.out.println("Hello ! my favourite dialogue is \"Hawa Aane de!\"");

        //Strings are immutable in nature for eg:
        String string1= new String("Jaadu");
        System.out.println(System.identityHashCode(string1));
        string1 = string1.concat("Nazar");
        System.out.println(string1);
        System.out.println(System.identityHashCode(string1)); //will show different address cause new string is created

        //string operations 
        System.out.println(string1.substring(0, 2));
        System.out.println(string1.charAt(5));
        //and many more
    }
    
}
