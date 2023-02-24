public class MultipleExceptions {
    public static void main(String[] args) {
        int[] nums={1,0,3};
        
        divide(nums);

        nums[1]=2;
        ModifiedDivide(nums);
        UpdateArray(nums);
    }

    //using multiple catch statements
    public static void divide(int[] nums){
        try{
            int result = nums[0]/nums[1];
            nums[4]=result;
        }
        catch(ArithmeticException e1){
            System.out.println(e1.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e2){
            System.out.println(e2.getMessage());
        }
    }

    //handling multiple exceptions in a single catch block

    public static void ModifiedDivide(int[] nums){
        try{
            int result = nums[0]/nums[1];
            nums[4]=result;
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

    //catching base Exception 
    public static void UpdateArray(int[] nums){
        try{
            nums[10]=10;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    //child base exeception can also be added in same catch block:
    //eg: catch(Exception | ArithmeticException e)
}
