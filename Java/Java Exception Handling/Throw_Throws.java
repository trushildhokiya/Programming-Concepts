public class Throw_Throws {
    public static void main(String[] args) {
        //divide(12, 0);
        
        int[] numbers ={1,2,3};
        //DivideAndUpdate(numbers, 17, 7, 4);

        try{
            divideDouble();
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    //throws keyword
    public static void divide(int num1 , int num2) throws ArithmeticException{
        int result = num1/num2;
        System.out.println(result);
    }

    //throwing multiple exceptions
    public static void DivideAndUpdate(int[] nums , int num1, int num2 , int index) throws ArithmeticException, ArrayIndexOutOfBoundsException{
        int result  = num1/num2;
        nums[index]=result;
    }

    //throw keyword is used to handle a single excption explicitly
    public static void divideDouble() throws ArithmeticException{
        throw new ArithmeticException("cannot divide by zero you fool!");
    }

}
