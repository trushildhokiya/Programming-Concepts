public class Recursion {
    public static void main(String[] args) {
        System.out.println(findFactorial(5));
    }

    //recursion is a programming concept where a function call itself until a termination condiion
    //is met it may or may not return a value depending of problem given
    //Concept of recursion can be better understood by using stcaks
    public static int findFactorial(int num){
        if(num==0){
            return 1;
        }
        if(num ==1){
            return 1;
        }
        return (num*findFactorial(num-1));
    }
}
