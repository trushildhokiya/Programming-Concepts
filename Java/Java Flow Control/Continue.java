import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //using unlabeled continue statements print sum of only positive numbers entered in 5 occurances

        int sum=0;

        for (int i=0;i<5;i++){
            System.out.println("Enter number "+(i+1));
            int x= sc.nextInt();

            if(x<0){
                continue;
            }
            sum=sum+x;
        }

        System.out.println("Sum (+ve) is: "+sum);

        //labeled continue statements
        //taking example from Break.java and skip 3 row to print

        int[][] myMatrix = {{1,2,3,4},{7,8,9,10},{7,4,1,0},{0,1,5,9}};

        first:
        for(int i=0;i<myMatrix.length;i++){

            second:

            for(int j=0;j<myMatrix[i].length;j++){
                if(i==2){
                    continue second;
                }
                System.out.print(myMatrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
