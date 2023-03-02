public class Methods {
    public static void main(String[] args) {
        //create instance of Methods class
        Methods fObj = new Methods();
        fObj.sayNight();

        sayMorning(); //can be also called as Methods.sayMoning()

        System.out.println("2 raise to 5 is: "+power(2,5));
    }

    //non static methods
    public void sayNight(){
        System.out.println("Good Night!");
    }
    //method declaring
    //access_modifier static/nonstatic returnType methodNme(parameters if any)
    //without parameters
    public static void sayMorning(){
        System.out.println("Good Morning!");
    }

    //with parameters
    public static int power(int num , int pow){
        int value=1;
        for (int i=0;i<pow;i++){
            value=value*num;
        }
        return value;
    }
}
