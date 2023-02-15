import java.util.Scanner;
import java.util.regex.MatchResult;

public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //find if entered number s prime or not using break statements (unlabeled):
        System.out.println("Enter any random number: ");
        int x = sc.nextInt();
        int flag=2;
        for ( int i=2;i>0;i++){
            if(x%i==0 && x!=x){
                flag=1;
                break;
            }
            flag=0;
        }

        if(flag==0){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a prime number");
        }

        //labeled break statement 
        //printing a single row of array from a 2-d array
        int[][] myMatrix = {{1,2,3,4},{7,8,9,10},{7,4,1,0},{0,1,5,9}};

        first:
        for(int i=0;i<myMatrix.length;i++){

            second:

            for(int j=0;j<myMatrix[i].length;j++){

                System.out.print(myMatrix[i][j]+"\t");
                
                if(j==myMatrix[i].length-1){
                    break first;
                }
            }
            System.out.println();
        }

    }
}
