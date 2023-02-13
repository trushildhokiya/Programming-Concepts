public class Variables{
    public static void main(String[] args) {
        
        // you can drclare a variable like : data_type variable_name = value
        int myScore =90;
        //here myScore is a variable of integer dataType and value 90 is stored in it
        
        //Different literals
        //1. Integer
        int myLuckyNumber = 26;
        //2.FLoat (mandatory to end with a caputal F)
        float myPercentage = 88.124F;
        
        //3.Character (char to be written in single quiotes )
        char myAlphabet ='a';
        //4.String (array of characters: to be written in double quotes)
        String myName= "Trushil Dhokiya";

        System.out.println("Hello everybody. My name is "+myName+". My luck number is "+myLuckyNumber+" I scored "+myScore+" marks and got a "+myPercentage+" percent overall . I was graded "+myAlphabet+"\nThankyou for listening patiently");
    }
}