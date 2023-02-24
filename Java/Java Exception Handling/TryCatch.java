public class TryCatch {
    public static void main(String[] args) {
        divide(12, 0); 
        floatDivision(12.12,0);

        int[] nums = {1,2,3};
        changeFourthIndex(nums);

        divideAndUpdate(12, 10, nums, 5);
    }
    
    //try catch block
    public static void divide(int numerator , int denominator){
        try{
            int result = numerator/denominator;
        }
        catch(ArithmeticException e){
            System.out.println("Exception Occured! \nException:"+e.getMessage());
        }
    }

    //try finally block
    public static void floatDivision(double numerator , double denominator){
        double result= -1.0;
        try{
            result = numerator/denominator;
        }
        finally{
            System.out.println("Result calculated is: "+result);
        }
    }

    //try catch finally
    public static void changeFourthIndex(int[] numbers){
        try{
            numbers[4]=8086;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception: "+e.getMessage());
        }
        finally{
            System.out.println("Function Executed Successfully! ");
        }
    }

    //try with multiple catch statements
    public static void divideAndUpdate(int numerator , int denominator , int[] numbers,int index){
        int result =0;
        try{
            result= numerator/denominator;
            numbers[index]=result;
        }
        catch(ArithmeticException e1){
            System.out.println(e1.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e2){
            System.out.println(e2.getMessage());
        }

    }
}
