import javax.print.DocFlavor.INPUT_STREAM;

public class EnumStrings {
    public static void main(String[] args) {
        // converting enum value to string 

        System.out.println(Ingredients.KETCHUP.toString().toLowerCase());

        System.out.println(Degrees.MASTERS.toString());
    }
}

enum Ingredients{
    KETCHUP , CHILLISAUCE , JAM ;
}

//hanging default string representation of enum values
//by overiding the toString method of ENUMS
enum Degrees{
    BACHELORS{
        @Override
        public String toString(){
            return "I am a bachelor!";
        }
    },

    MASTERS{
        @Override
        public String toString(){
            return "I am a Master! ";
        }
    },

    PHD{
        @Override
        public String toString(){
            return "I am most Intelligent of all !";
        }
    };
}