public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Sum is "+add(10,20,30,40)); 
        formatNumber("120.14578995");
    }


    //method overloading is when you have same method name but different number of parameters ,
    //different type of parameters

    //1.different amount of parameters
    public static int add(int a,int b){
        return a;
    }

    public static int add(int a , int b , int c){
        return a+b+c;
    }

    public static int add(int ...v){
        int sum=0;
        for(int x:v){
            sum=sum+x;
        }
        return sum;
    }

    //method overloading with different data types
    public static void formatNumber(int num){
        System.out.printf("%d",num);
    }

    public static void formatNumber(double num){
        System.out.printf("%.4f",num);
    }

    public static void formatNumber(String num){
        System.out.printf("%.3f",Double.parseDouble(num));
    }

}