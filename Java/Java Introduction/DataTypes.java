public class DataTypes{
    public static void main(String[] args) {
        //data types there are 8 primitive Data types in java
        //1. byte (range -127 to 128) {if out of range will throw compilation error}

        byte myByte=124;
        System.out.println(myByte);
        
        //2. short (range : -32k to 32k)
        short myShort = 7895;
        System.out.println(myShort);

        //3. int (stores integer values only) 
        int myInt = 78942;
        System.out.println(myInt);

        //4. float 8de (32 bit precision )
        float myFloat = 12.45F;
        System.out.println(myFloat);

        //5. double (64 bit precision)
        double myDouble = 7.45895214;
        System.out.println(myDouble);

        //6. long
        long myLong= 789464455L;
        System.out.println(myLong);

        //7. boolean (true or false values only)
        boolean myBoolean = true;
        System.out.println(myBoolean);

        //8. String / char
        String myString = "I won FIFA 2022!";
        System.out.println(myString);

    }
}