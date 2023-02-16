import java.util.Arrays;

public class CopyArrays {
    public static void main(String[] args) {
        //copy array 
        //1. using assignment operatot '=':
        int[] array1 = {1,2,3,4,5,6,7,8,9};
        int[] array2=array1;
        System.out.println(Arrays.toString(array2));

        //now if we change in copy of array2 array1 also changes;
        array2[0]=100;
        System.out.println(Arrays.toString(array1));

        //for proper output
        System.out.println();

        //2. Using loopd to copy an array
        int[] array3= {1,2,3,4,5,6,7,8,9};
        int[] array4 = new int[array3.length];
        for(int i=0;i<array3.length;i++){
            array4[i]=array3[i];
        }

        System.out.println(Arrays.toString(array4));

        //for proper output
        System.out.println();
        
        //now if we change array4[] values array3 stays same indepent of any change in array4 
        //since menory locations in which values are stored are different

        //3. arraycopy() method of system:
        //paramerters src array , startindex of src array, dest arr, start index of dest arr, no of elements to copy
        int[] array5= {7,8,9,4,5,6,1,2,3};
        int[] array6= new int[array5.length];

        System.arraycopy(array5, 0, array6, 0, array5.length);
        System.out.println(Arrays.toString(array6));

        //for proper output
        System.out.println();
        
        //changing copied array doesnt affect source array

        //4. using copyOfRange() method of Arrays class in java.util.Arrays;

        int[] array7= {7,4,1,8,5,2,9,6,3};
        int[] array8 = Arrays.copyOfRange(array7, 0, array7.length-3);
        System.out.println(Arrays.toString(array8));

        //for proper output
        System.out.println();
        
        //5. copy 2d arrays using loops
        int[][] array9 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] array10 = new int[3][3];
        for(int i=0 ;i<array9.length;i++){
            for(int j=0;j<array9[i].length;j++){
                array10[i][j]=array9[i][j];
            }
        }

        //print 2d array
        for(int[] x : array10){
            System.out.println(Arrays.toString(x));
        }
        
    }
}
