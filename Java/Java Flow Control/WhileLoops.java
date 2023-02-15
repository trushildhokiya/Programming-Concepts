public class WhileLoops {
    public static void main(String[] args) {
        
        //print 1-10 using while loop
        int n=0;
        while(n<=10){
            System.out.print(n+"\t");
            n++;
        }
        System.out.println();
        
        //do while loops (it executes statement atleast once even if condition is false)
        int y=10;
        do{
            System.out.println("I am running");
        }while(y>20);
    }
}
