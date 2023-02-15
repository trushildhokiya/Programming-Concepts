import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        //for loop 
        //print sum of n natural numbers

        System.out.println("Enter value of n: ");
        int n= sc.nextInt();

        sc.close();
        int sum =0;
        for (int i = 0; i <= n; i++) {
            sum+=i;
        }

        System.out.println("Sum of first "+n+" natural numbers is "+sum);

        //for each loop 
        //declare an array of integers called myMarks
        int[] myMarks={10,50,60,100};
        int mytotalMarks=0;
        for(int x: myMarks){
            mytotalMarks=mytotalMarks+x;
        }
        System.out.println("I scored a total of : "+mytotalMarks+" marks.");
    }
}
