import java.util.Arrays;

public class MultiDArrays {
    public static void main(String[] args) {
        
        //declaring an intializing 2d array in java
        int[][] myArray ={
            {1,2,3},
            {4,5},
            {6}
        };

        //print 2d array:
        for(int[] x: myArray){
            System.out.println(Arrays.toString(x));
        }
        
        /**Similarlt 3d arrays can be initialized for eg:
        // int[][][] = {{{1,2},{3,4}},{{5,4,6},{7,8,9}}};
        and can be printed**/
    }
}
