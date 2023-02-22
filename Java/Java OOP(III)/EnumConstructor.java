public class EnumConstructor {
    public static void main(String[] args) {
        
        Cars car = Cars.MERCEDES;
        System.out.println(car.getDetails());
    }    
}

//creating enum
enum Cars{
    MERCEDES("Mercedes MAYBACH S650"),
    ROLLSROYCE("MUCH EXPENSIVE"),
    BMW("NEW MODEL");

    private final String detail;
    //creating an enum constructing whichacceps string
    private Cars(String detail){
        this.detail=detail;
    }

    public String getDetails(){
        return this.detail;
    }
}
