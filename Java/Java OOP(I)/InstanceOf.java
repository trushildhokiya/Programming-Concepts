public class InstanceOf {
    public static void main(String[] args) {
        String name = "Hogwarts";
        System.out.println(name instanceof String);

        HarryPotter hp1 = new HarryPotter();
        System.out.println(hp1 instanceof Human);
        
    }
}
//instance of key word is used to check whether object is insance of  a class or not return true or false
class Human{
    
}

class HarryPotter extends Human{

}
